<!DOCTYPE html>
<html lang="en">
<head>
	<!--
		Charisma v1.0.0

		Copyright 2012 Muhammad Usman
		Licensed under the Apache License v2.0
		http://www.apache.org/licenses/LICENSE-2.0

		http://usman.it
		http://twitter.com/halalit_usman
	-->
	<meta charset="utf-8">
	<title>人才库</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.">
	<meta name="author" content="Muhammad Usman">

	<!-- The styles -->
	<link id="bs-css" href="css/bootstrap-cerulean.css" rel="stylesheet">
	<style type="text/css">
	  body {
		padding-bottom: 40px;
	  }
	  .sidebar-nav {
		padding: 9px 0;
	  }
	</style>
	<link href="css/bootstrap-responsive.css" rel="stylesheet">
	<link href="css/charisma-app.css" rel="stylesheet">
	<link href="css/jquery-ui-1.8.21.custom.css" rel="stylesheet">
	<link href='css/fullcalendar.css' rel='stylesheet'>
	<link href='css/fullcalendar.print.css' rel='stylesheet'  media='print'>
	<link href='css/chosen.css' rel='stylesheet'>
	<link href='css/uniform.default.css' rel='stylesheet'>
	<link href='css/colorbox.css' rel='stylesheet'>
	<link href='css/jquery.cleditor.css' rel='stylesheet'>
	<link href='css/jquery.noty.css' rel='stylesheet'>
	<link href='css/noty_theme_default.css' rel='stylesheet'>
	<link href='css/elfinder.min.css' rel='stylesheet'>
	<link href='css/elfinder.theme.css' rel='stylesheet'>
	<link href='css/jquery.iphone.toggle.css' rel='stylesheet'>
	<link href='css/opa-icons.css' rel='stylesheet'>
	<link href='css/uploadify.css' rel='stylesheet'>

	<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

	<!-- The fav icon -->
	<link rel="shortcut icon" href="img/favicon.ico">

	<script>

		/* 额外自己写的方法，左边菜单点击调整刷新 */
		function clickMenu(buttonType){

			var but_url = "/" + buttonType;

			$("#changeMeun").attr("action",but_url);

			$("#changeMeun").submit();
		}

		function selectForm(buttonType){

			var but_url = "/" + buttonType;

			$("#selectForm").attr("action",but_url);

			$("#selectForm").submit();
		}

		// 列表排序查询
		function selectListByTh(thType){

			var idVar = "#" + thType;

			// 切换样式
			if("icon-resize-vertical" == $(idVar).attr("class")){

				// 初始化全部同样式
				$("#trId i").attr("class","icon-resize-vertical");

				// 第一次点击先降序
				$(idVar).attr("class","icon-arrow-down");

				$("#paixu").val(thType + "-desc");

			}else if("icon-arrow-down" == $(idVar).attr("class")){

				// 初始化全部同样式
				$("#trId i").attr("class","icon-resize-vertical");

				// 降序变升序
				$(idVar).attr("class","icon-arrow-up");

				$("#paixu").val(thType + "-asc");

			}else if("icon-arrow-up" == $(idVar).attr("class")){

				// 初始化全部同样式
				$("#trId i").attr("class","icon-resize-vertical");

				// 升序变降序
				$(idVar).attr("class","icon-arrow-down");

				$("#paixu").val(thType + "-desc");
			}

			// 排序查询
			selectList();
		}

		// 异步查询员工列表
		function selectList()
		{
			var username = $("#username").val();
			var selectSex = $("#selectSex").val();
			var selectDepartment = $("#selectDepartment").val();
			var entryTime01 = $("#entryTime01").val();
			var entryTime02 = $("#entryTime02").val();
			var entryBeforeYears01 = $("#entryBeforeYears01").val();
			var entryBeforeYears02 = $("#entryBeforeYears02").val();
			var entryBeforeYearsAll01 = $("#entryBeforeYearsAll01").val();
			var entryBeforeYearsAll02 = $("#entryBeforeYearsAll02").val();
			var paixu = $("#paixu").val();

			$.ajax
			({
				url: "/selectUserAjax",
				dataType: "json",
				type: "post",
				data: {
					username: username,
					selectSex: selectSex,
					selectDepartment: selectDepartment,
					entryTime01: entryTime01,
					entryTime02: entryTime02,
					entryBeforeYears01: entryBeforeYears01,
					entryBeforeYears02: entryBeforeYears02,
					entryBeforeYearsAll01: entryBeforeYearsAll01,
					entryBeforeYearsAll02: entryBeforeYearsAll02,
					paixu: paixu,
				},
				success:function(data){

					$("#showListTr").empty();

					if(data.length > 0){

						let index;

						for(index in data) {

							var trdata = "<tr><td style=\"text-align: center;\">" + index + " <input type=\"checkbox\" name='yy" + index + "' value='" + data[index].userId + "'></td>" +

									"<td class=\"center\" style=\"text-align: center;\">" + data[index].userName + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].department + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].psot + "</td>";

									if("M" == data[index].sex){

										trdata = trdata + "<td class=\"center\" style=\"text-align: center;\"><span class=\"label label-important\">" + data[index].sex + "</span></td>"

									}else{

										trdata = trdata +  "<td class=\"center\" style=\"text-align: center;\"><span class=\"label label-success\">" + data[index].sex + "</span></td>"
									}
									trdata = trdata + "<td class=\"center\" style=\"text-align: center;\">" + data[index].entryTime01 + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].entryBeforeYears + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].entryGrade + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].entrySalary + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].ontrialSalary + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].currentGrade + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].currentSalary + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].whetherExtrapolation + "</td>" +
									"<td class=\"center\" style=\"text-align: center;display: none\">" + data[index].graduationSchool + "</td>" +
									"<td class=\"center\" style=\"text-align: center;display: none\">" + data[index].graduationTime + "</td>" +
									"<td class=\"center\" style=\"text-align: center;display: none\">" + data[index].major + "</td>" +
									"<td class=\"center\" style=\"text-align: center;display: none\">" + data[index].education + "</td>" +
									"<td class=\"center\" style=\"text-align: center;display: none\">" + data[index].recruitContributionOne + "</td>" +
									"<td class=\"center\" style=\"text-align: center;display: none\">" + data[index].recruitContributionTwo + "</td>" +
									"<td class=\"center\" style=\"text-align: center;display: none\">" + data[index].isJob + "</td>" +
									"</tr>";

							$("#showListTr").append(trdata);

							console.log(trdata);  //在console中查看数据
						}
					}

					console.log(data);  //在console中查看数据
				},
				error:function(){

					alert('failed!');
				},
			});
		}

		// 修改员工
		function selectListOne(){

			var i = 0;

			$(":checkbox").each(function(){

				if($(this).is(':checked')){

					$("#usetId").val($(this).val());

					i = i + 1;
				}
			});

			if(i > 1){

				alert("只能选择一条");
			}

			$("#selectForm").attr("action","/showUserUpdate");

			$("#selectForm").submit();
		}
	</script>
</head>

<body>

	<!-- topbar starts -->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</a>
				<a class="brand" href="#"> <img alt="Charisma Logo" src="img/logo20.png" /> <span>Charisma</span></a>
				
				<!-- theme selector starts -->
				<div class="btn-group pull-right theme-container" >
					<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
						<i class="icon-tint"></i><span class="hidden-phone"> Change Theme / Skin</span>
						<span class="caret"></span>
					</a>
					<ul class="dropdown-menu" id="themes">
						<li><a data-value="classic" href="#"><i class="icon-blank"></i> Classic</a></li>
						<li><a data-value="cerulean" href="#"><i class="icon-blank"></i> Cerulean</a></li>
						<li><a data-value="cyborg" href="#"><i class="icon-blank"></i> Cyborg</a></li>
						<li><a data-value="redy" href="#"><i class="icon-blank"></i> Redy</a></li>
						<li><a data-value="journal" href="#"><i class="icon-blank"></i> Journal</a></li>
						<li><a data-value="simplex" href="#"><i class="icon-blank"></i> Simplex</a></li>
						<li><a data-value="slate" href="#"><i class="icon-blank"></i> Slate</a></li>
						<li><a data-value="spacelab" href="#"><i class="icon-blank"></i> Spacelab</a></li>
						<li><a data-value="united" href="#"><i class="icon-blank"></i> United</a></li>
					</ul>
				</div>
				<!-- theme selector ends -->
				
				<!-- user dropdown starts -->
				<div class="btn-group pull-right" >
					<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
						<i class="icon-user"></i><span class="hidden-phone"> ${userCode}</span>
						<span class="caret"></span>
					</a>
					<ul class="dropdown-menu">
						<li><a href="#">Profile</a></li>
						<li class="divider"></li>
						<li><a href="login.ftl">Logout</a></li>
					</ul>
				</div>
				<!-- user dropdown ends -->
			</div>
		</div>
	</div>
	<!-- topbar ends -->
	<div class="container-fluid">
		<div class="row-fluid">

			<!-- left menu starts -->
			<div class="span2 main-menu-span">
				<div class="well nav-collapse sidebar-nav">
					<ul class="nav nav-tabs nav-stacked main-menu">
						<li class="nav-header hidden-tablet">Main</li>
						<li><a class="ajax-link" onclick='clickMenu("showErpRecord")'><i class="icon-eye-open"></i><span class="hidden-tablet"> 账号管理</span></a></li>
						<li><a class="ajax-link" onclick='clickMenu("showTable")'><i class="icon-home"></i><span class="hidden-tablet"> 员工列表</span></a></li>
						<li><a class="ajax-link" onclick='clickMenu("showJiXiao")'><i class="icon-list-alt"></i><span class="hidden-tablet"> 绩效列表</span></a></li>
						<li><a class="ajax-link" onclick='clickMenu("showKaoQin")'><i class="icon-align-justify"></i><span class="hidden-tablet"> 考勤列表</span></a></li>
						<li><a class="ajax-link" onclick='clickMenu("showTypography")'><i class="icon-font"></i><span class="hidden-tablet"> 个人详情</span></a></li>
						<li><a class="ajax-link" onclick='clickMenu("showCalendar")'><i class="icon-calendar"></i><span class="hidden-tablet"> Calendar</span></a></li>
						<li><a class="ajax-link" onclick='clickMenu("showIcon")'><i class="icon-star"></i><span class="hidden-tablet"> 图标展示</span></a></li>
						<li><a onclick='clickMenu("showlogin")'><i class="icon-lock"></i><span class="hidden-tablet"> 退出登陆</span></a></li>
					</ul>
				</div><!--/.well -->
			</div><!--/span-->

			<!-- 跳转后台使用表单提交 -->
			<form id="changeMeun" action="#" method="post"></form>
			<!-- left menu ends -->


			<noscript>
				<div class="alert alert-block span10">
					<h4 class="alert-heading">Warning!</h4>
					<p>You need to have <a href="#" target="_blank">JavaScript</a> enabled to use this site.</p>
				</div>
			</noscript>
			
			<div id="content" class="span10">
			<!-- content starts -->

				<div>
					<ul class="breadcrumb">
						<li>
							<a href="#">Home</a> <span class="divider">/</span>
						</li>
						<li>
							<a href="#">Tables</a>
						</li>
					</ul>
				</div>

				<div class="row-fluid sortable">
					<div class="box span12">
						<div class="box-header well" data-original-title>
							<h2><i class="icon-user"></i> 员工档案</h2>
							<div class="box-icon">
								<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
							</div>
						</div>

						<div class="box-content">

							<form id="selectForm" action="#" method="post">

								<div class="dataTables_filter">
									<label>
										姓名: <input type="text" name="username" id="username">
										&nbsp;&nbsp;入职时间: <input type="text" class="input-xlarge datepicker" id="entryTime01" value=""> - <input type="text" class="input-xlarge datepicker" id="entryTime02" value="">
										&nbsp;&nbsp;入职前年限: <input type="text" id="entryBeforeYears01"> - <input type="text" id="entryBeforeYears02">
										&nbsp;&nbsp;总年限: <input type="text" id="entryBeforeYearsAll01"> - <input type="text" id="entryBeforeYearsAll02">
										<input type="hidden" id="paixu" value="all">
										<input type="hidden" id="usetId" name="userId" value="">
									</label>
								</div>

								<div class="control-group">
									<div class="controls">
										<select id="selectDepartment">
											<option value="" selected="selected">全部部门</option>
											<option value="电商平台">电商平台</option>
											<option value="采购平台">采购平台</option>
											<option value="仓储平台">仓储平台</option>
											<option value="财务平台">财务平台</option>
											<option value="数据平台">数据平台</option>
										</select>

										<select id="selectSex" name="sex">
											<option value="" selected="selected">性别</option>
											<option value="G">男</option>
											<option value="M">女</option>
										</select>
									</div>
								</div>

								<a class="btn btn-success" onclick='selectList()'>
									<i class="icon-zoom-in icon-white"></i>
									查询
								</a>

								<a class="btn btn-success" onclick='selectListOne()'>
									<i class="icon-zoom-in icon-white"></i>
									修改
								</a>

							</form>

							<table class="table table-striped table-bordered bootstrap-datatable">
							  <thead>
								  <tr id="trId">
									  <th style="width: 20px;text-align: center;">序号</th>
									  <th style="width: 40px;text-align: center;" id="userName">员工姓名</th>
									  <th style="width: 40px;text-align: center;" >部门 <i class="icon-resize-vertical" id="department" onclick="selectListByTh('department')" ></i></th>
									  <th style="width: 40px;text-align: center;" >职位 <i class="icon-resize-vertical" id="psot" onclick="selectListByTh('psot')" ></i></th>
									  <th style="width: 25px;text-align: center;" >性别 <i class="icon-resize-vertical" id="sex" onclick="selectListByTh('sex')" ></i></th>
									  <th style="width: 40px;text-align: center;" id="entryTime">入职时间 <i class="icon-resize-vertical" id="entry_time" onclick="selectListByTh('entry_time')" ></i></th>
									  <th style="width: 45px;text-align: center;" id="entryBeforeYears">入职前年限 <i class="icon-resize-vertical" id="entry_before_years" onclick="selectListByTh('entry_before_years')"></i></th>
									  <th style="width: 40px;text-align: center;" id="entryGrade">入职评级 <i class="icon-resize-vertical" id="entry_grade" onclick="selectListByTh('entry_grade')"></i></th>
									  <th style="width: 40px;text-align: center;" id="entrySalary">入职薪资 <i class="icon-resize-vertical" id="entry_salary" onclick="selectListByTh('entry_salary')"></i></th>
									  <th style="width: 40px;text-align: center;" id="ontrialSalary">试用薪资</th>
									  <th style="width: 40px;text-align: center;" id="currentGrade">当前评级 <i class="icon-resize-vertical" id="current_grade" onclick="selectListByTh('current_grade')"></i></th>
									  <th style="width: 40px;text-align: center;" id="currentSalary">当前薪资 <i class="icon-resize-vertical" id="current_salary" onclick="selectListByTh('current_salary')"></i></th>
									  <th style="width: 40px;text-align: center;" id="whetherExtrapolation">是否内推</th>
									  <th style="width: 50px;text-align: center;display: none" id="graduationSchool">毕业学校</th>
									  <th style="width: 40px;text-align: center;display: none" id="graduationTime">毕业时间</th>
									  <th style="width: 40px;text-align: center;display: none" id="major">专业</th>
									  <th style="width: 40px;text-align: center;display: none" id="education">学历</th>
									  <th style="width: 40px;text-align: center;display: none" id="recruitContributionOne">招聘人1</th>
									  <th style="width: 40px;text-align: center;display: none" id="recruitContributionTwo">招聘人1</th>
									  <th style="width: 40px;text-align: center;display: none" id="isJob">是否在职</th>
								  </tr>
							  </thead>
							  <tbody id="showListTr">

								<#--<tr>
									<td>David R</td>
									<td class="center">2012/01/01</td>
									<td class="center">Member</td>
									<td class="center">
										<span class="label label-success">Active</span>
									</td>
									<td class="center">
										<a class="btn btn-success" href="#">
											<i class="icon-zoom-in icon-white"></i>
											View
										</a>
										<a class="btn btn-info" href="#">
											<i class="icon-edit icon-white"></i>
											Edit
										</a>
										<a class="btn btn-danger" href="#">
											<i class="icon-trash icon-white"></i>
											Delete
										</a>
									</td>
								</tr>-->

							  </tbody>
						  </table>
						</div>
					</div><!--/span-->

				</div><!--/row-->
			<!-- content ends -->
			</div><!--/#content.span10-->
		</div><!--/fluid-row-->
				
		<hr>

		<div class="modal hide fade" id="myModal">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">×</button>
				<h3>Settings</h3>
			</div>
			<div class="modal-body">
				<p>Here settings can be configured...</p>
			</div>
			<div class="modal-footer">
				<a href="#" class="btn" data-dismiss="modal">Close</a>
				<a href="#" class="btn btn-primary">Save changes</a>
			</div>
		</div>
		
	</div><!--/.fluid-container-->

	<!-- external javascript
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->

	<!-- jQuery -->
	<script src="js/jquery-1.7.2.min.js"></script>
	<!-- jQuery UI -->
	<script src="js/jquery-ui-1.8.21.custom.min.js"></script>
	<!-- transition / effect library -->
	<script src="js/bootstrap-transition.js"></script>
	<!-- alert enhancer library -->
	<script src="js/bootstrap-alert.js"></script>
	<!-- modal / dialog library -->
	<script src="js/bootstrap-modal.js"></script>
	<!-- custom dropdown library -->
	<script src="js/bootstrap-dropdown.js"></script>
	<!-- scrolspy library -->
	<script src="js/bootstrap-scrollspy.js"></script>
	<!-- library for creating tabs -->
	<script src="js/bootstrap-tab.js"></script>
	<!-- library for advanced tooltip -->
	<script src="js/bootstrap-tooltip.js"></script>
	<!-- popover effect library -->
	<script src="js/bootstrap-popover.js"></script>
	<!-- button enhancer library -->
	<script src="js/bootstrap-button.js"></script>
	<!-- accordion library (optional, not used in demo) -->
	<script src="js/bootstrap-collapse.js"></script>
	<!-- carousel slideshow library (optional, not used in demo) -->
	<script src="js/bootstrap-carousel.js"></script>
	<!-- autocomplete library -->
	<script src="js/bootstrap-typeahead.js"></script>
	<!-- tour library -->
	<script src="js/bootstrap-tour.js"></script>
	<!-- library for cookie management -->
	<script src="js/jquery.cookie.js"></script>
	<!-- calander plugin -->
	<script src='js/fullcalendar.min.js'></script>
	<!-- data table plugin -->
	<script src='js/jquery.dataTables.min.js'></script>

	<!-- chart libraries start -->
	<script src="js/excanvas.js"></script>
	<script src="js/jquery.flot.min.js"></script>
	<script src="js/jquery.flot.pie.min.js"></script>
	<script src="js/jquery.flot.stack.js"></script>
	<script src="js/jquery.flot.resize.min.js"></script>
	<!-- chart libraries end -->

	<!-- select or dropdown enhancer -->
	<script src="js/jquery.chosen.min.js"></script>
	<!-- checkbox, radio, and file input styler -->
	<script src="js/jquery.uniform.min.js"></script>
	<!-- plugin for gallery image view -->
	<script src="js/jquery.colorbox.min.js"></script>
	<!-- rich text editor library -->
	<script src="js/jquery.cleditor.min.js"></script>
	<!-- notification plugin -->
	<script src="js/jquery.noty.js"></script>
	<!-- file manager library -->
	<script src="js/jquery.elfinder.min.js"></script>
	<!-- star rating plugin -->
	<script src="js/jquery.raty.min.js"></script>
	<!-- for iOS style toggle switch -->
	<script src="js/jquery.iphone.toggle.js"></script>
	<!-- autogrowing textarea plugin -->
	<script src="js/jquery.autogrow-textarea.js"></script>
	<!-- multiple file upload plugin -->
	<script src="js/jquery.uploadify-3.1.min.js"></script>
	<!-- history.js for cross-browser state change on ajax -->
	<script src="js/jquery.history.js"></script>
	<!-- application script for Charisma demo -->
	<script src="js/charisma.js"></script>

</body>
</html>
