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

			$.ajax
			({
				url: "/selectUserAjax",
				dataType: "json",
				type: "post",
				data: {
					username: username,
					sex: sex,
					selectSex: selectSex,
					selectDepartment: selectDepartment,
					entryTime01: entryTime01,
					entryTime02: entryTime02,
					entryBeforeYears01: entryBeforeYears01,
					entryBeforeYears02: entryBeforeYears02,
					entryBeforeYearsAll01: entryBeforeYearsAll01,
					entryBeforeYearsAll02: entryBeforeYearsAll02,
				},
				success:function(data){

					$("#showListTr").empty();

					if(data.length > 0){

						let index;

						for(index in data) {

							var trdata = "<tr><td style=\"text-align: center;\">" + index + "</td>" +

									"<td class=\"center\" style=\"text-align: center;\">" + data[index].userName + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].department + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].psot + "</td>";

									if("M" == data[index].sex){

										trdata = trdata + "<td class=\"center\" style=\"text-align: center;\"><span class=\"label label-important\">" + data[index].sex + "</span></td>"

									}else{

										trdata = trdata +  "<td class=\"center\" style=\"text-align: center;\"><span class=\"label label-success\">" + data[index].sex + "</span></td>"
									}

									trdata = trdata + "<td class=\"center\" style=\"text-align: center;\">" + data[index].entryTime + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].entryBeforeYears + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].entryGrade + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].entrySalary + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].ontrialSalary + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].currentGrade + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].currentSalary + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].whetherExtrapolation + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].graduationSchool + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].graduationTime + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].major + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].education + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].recruitContributionOne + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].recruitContributionTwo + "</td>" +
									"<td class=\"center\" style=\"text-align: center;\">" + data[index].isJob + "</td>" +
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
						<li><a class="ajax-link" onclick='clickMenu("showTable")'><i class="icon-align-justify"></i><span class="hidden-tablet"> 列表数据</span></a></li>
						<li><a class="ajax-link" onclick='clickMenu("showTypography")'><i class="icon-font"></i><span class="hidden-tablet"> 个人详情</span></a></li>
						<li><a class="ajax-link" onclick='clickMenu("showCalendar")'><i class="icon-calendar"></i><span class="hidden-tablet"> Calendar</span></a></li>
						<li><a class="ajax-link" onclick='clickMenu("showIcon")'><i class="icon-star"></i><span class="hidden-tablet"> 图标展示</span></a></li>
						<li><a onclick='clickMenu("showlogin")'><i class="icon-lock"></i><span class="hidden-tablet"> 退出登陆</span></a></li>
					</ul>
					<#--<label id="for-is-ajax" class="hidden-tablet" for="is-ajax"><input id="is-ajax" type="checkbox"> Ajax on menu</label>-->
				</div><!--/.well -->
			</div><!--/span-->
			<!-- left menu ends -->

			<!-- 跳转后台使用表单提交 -->
			<form id="changeMeun" action="#" method="post"></form>
			
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
							<h2><i class="icon-user"></i> Members</h2>
							<div class="box-icon">
								<#--<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
								<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>-->
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
									</label>
								</div>

								<div class="control-group">
									<div class="controls">
										<select id="selectDepartment">
											<option value="" selected="selected">全部部门</option>
											<option value="ECP">电商平台</option>
											<option value="PMS">采购平台</option>
											<option value="PSS">仓储平台</option>
											<option value="RC">财务平台</option>
											<option value="DAP">数据平台</option>
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

							</form>

							<table class="table table-striped table-bordered bootstrap-datatable">
							  <thead>
								  <tr>
									  <th style="width: 20px;text-align: center;">序号</th>
									  <th style="width: 40px;text-align: center;" id="userName">员工姓名</th>
									  <th style="width: 40px;text-align: center;" id="department">部门</th>
									  <th style="width: 40px;text-align: center;" id="psot">职位</th>
									  <th style="width: 25px;text-align: center;" id="sex">性别</th>
									  <th style="width: 40px;text-align: center;" id="entryTime">入职时间</th>
									  <th style="width: 45px;text-align: center;" id="entryBeforeYears">入职前年限</th>
									  <th style="width: 40px;text-align: center;" id="entryGrade">入职评级</th>
									  <th style="width: 40px;text-align: center;" id="entrySalary">入职薪资</th>
									  <th style="width: 40px;text-align: center;" id="ontrialSalary">试用薪资</th>
									  <th style="width: 40px;text-align: center;" id="currentGrade">当前评级</th>
									  <th style="width: 40px;text-align: center;" id="currentSalary">当前薪资</th>
									  <th style="width: 40px;text-align: center;" id="whetherExtrapolation">是否内推</th>
									  <th style="width: 50px;text-align: center;" id="graduationSchool">毕业学校</th>
									  <th style="width: 40px;text-align: center;" id="graduationTime">毕业时间</th>
									  <th style="width: 40px;text-align: center;" id="major">专业</th>
									  <th style="width: 40px;text-align: center;" id="education">学历</th>
									  <th style="width: 40px;text-align: center;" id="recruitContributionOne">招聘人1</th>
									  <th style="width: 40px;text-align: center;" id="recruitContributionTwo">招聘人1</th>
									  <th style="width: 40px;text-align: center;" id="isJob">是否在职</th>
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
