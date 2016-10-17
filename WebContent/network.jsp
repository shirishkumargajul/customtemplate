<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<s:head/>
</head>

<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<script src="js/collapse.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="UNITED COMMS Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<link
	href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic'
	rel='stylesheet' type='text/css'>
</head>
<body>
<!-- header-section-starts -->
<div class="header">
<div class="container">
<div class="logo"><a href="index.html"><img
	src="images/logo.png" class="img-responsive" alt="" /></a></div>
<div class="header-right">
<h4><i class="phone"></i>(573) 999 1234</h4>
<span class="menu"></span>
<div class="top-menu">
<ul>
	<li><a href="index.html">Home</a></li>
	<li><a href="404.html">Products</a></li>
	<li><a href="about.html">About Us</a></li>
	<li><a href="services.html">Services</a></li>
	<li><a href="login.jsp">Account</a></li>
	<li><a class="active" href="network.jsp">Start</a></li>
</ul>
</div>
<!-- script for menu --> <script>
	$("span.menu").click(function() {
		$(".top-menu").slideToggle("slow", function() {
			// Animation complete.
		});
	});
</script> <!-- script for menu --></div>
<div class="clearfix"></div>
</div>
</div>
<!-- header-section-ends -->
<div class="content">
<div class="contact about-desc">
<h3>Step 2/5 : Network-Connectivity</h3>
<div class="container">
<div class="row">
<div class="col-md-8 contact_left">
			<h4>Network Resources Identifier</h4>
   				<p class="m_6">In this step, we only focus on the Network resources of the template. 
   				<br>
   				Network resources mainly include bandwidth,Virtual Private Network, Virtualized in a dedicated hardware and so on.
   				</p>
   			<!-- Frequent Ques Part -->
   			<h4>Questions Explanation</h4>
   			<br>
   			<div class="row">
   				<div class="col-md-8">
	   				<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
						 <!-- Q1 -->
						  <div class="panel panel-default">
						    <div class="panel-heading" role="tab" id="headingOne">
						      <h5 class="panel-title">
						        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="false" aria-controls="collapseOne">
						          <strong>How to calculate your bandwidth requirement?</strong>
						        </a>
						      </h5>
						    </div>
						    <div id="collapseOne" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingOne">
						      <div class="panel-body">
						        The minimum bandwidth requirement means the bandwidth of your network that can satisfy your applications' requirement. In general, here is a simple way to calculate bandwidth needs in the form of : <strong>N * T = BN</strong>. 'N' equals numbers of users, 'T' equals traffic estimate based on usage weight and 'BN' means bandwidth needed.
						      </div>
						    </div>
						  </div>
					  
				
						  <!-- Q2 -->
						  <div class="panel panel-default">
						    <div class="panel-heading" role="tab" id="headingTwo">
						      <h5 class="panel-title">
						        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
						          <strong>What is the isolated network?</strong>
						        </a>
						      </h5>
						    </div>
						    <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
						      <div class="panel-body">
						       Isolated Network includes:
<br>·       10/100 copper switched ethernet to each network device.
<br>·       Connectivity to other devices on the isolated network.
<br>·       Configuring the port to the required network.
<br>·       Local DNS and DHCP services within the isolated network.
						      </div>
						    </div>
						  </div>
					
						  <!-- Q3 -->
						  <div class="panel panel-default">
						    <div class="panel-heading" role="tab" id="headingThree">
						      <h5 class="panel-title">
						        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
						          <strong>What is the VPN?</strong>
						        </a>
						      </h5>
						    </div>
						    <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
						      <div class="panel-body">
						        A Virtual Private Network (VPN) is a network technology that creates a secure network connection over a public network such as the Internet or a private network owned by a service provider. Large corporations, educational institutions, and government agencies use VPN technology to enable remote users to securely connect to a private network.
						      </div>
						    </div>
						  </div>
						  
						  <!-- Q4 -->
						  <div class="panel panel-default">
						    <div class="panel-heading" role="tab" id="headingFour">
						      <h5 class="panel-title">
						        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
						          <strong>What is your data type?</strong>
						        </a>
						      </h5>
						    </div>
						    <div id="collapseFour" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFour">
						      <div class="panel-body">
						        A data type in a programming language is a set of data with values having predefined characteristics. Examples of data types are: integer, floating point unit number, character, string, and pointer. Usually, a limited number of such data types come built into a language. The language usually specifies the range of values for a given data type, how the values are processed by the computer, and how they are stored.
						      </div>
						    </div>
						  </div>
						  
						 <!-- 
						  <div class="panel panel-default">
						    <div class="panel-heading" role="tab" id="headingFive">
						      <h5 class="panel-title">
						        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseFive" aria-expanded="false" aria-controls="collapseFive">
						          <strong>What is the meaning of which resource?</strong>
						        </a>
						      </h5>
						    </div>
						    <div id="collapseFive" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFive">
						      <div class="panel-body">
						        Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
						      </div>
						    </div>
						  </div>
						   -->
		 			
		 			</div>
		 		
	 			</div>
	 		</div>
	 			<p class="m_7">If you have any problem of this step or about the Network resources, please contact with us using the following contact information.</p>   
   			<!-- End Frequent Ques Part -->
   			
   			<div class="contact_grid contact_address">
						<h5>Contact Information:</h5>	
						<p>Telephone : 573-999-1234</p>
						<p>Fax : 573-999-1234</p>
						<p>Email : <a href="http://www.baidu.com">mizzou@mail.missouri.edu</a></p>
						<p>Address: EBW Room 237, MU, Columbia, MO, USA
			</div>
			
		</div>
<div class="col-md-4">
<div class="contact_right">
<div class="contact-form_grid">
<s:form action="getNectworkConnectivity" method="post" namespace="/">
	<p>Your minimum bandwidth</p>
	<s:fielderror fieldName="bandwidth"></s:fielderror>
	<%-- <select id="bandwidth" name="bandwidth">
		<option value="null" selected>Choose One:</option>
		<option value="bandwidth_opt1">10-20 Mbps (xy Gb data in t seconds)</option>
		<option value="bandwidth_opt2">20-100 Mbps (xy Gb data in t seconds)</option>
		<option value="bandwidth_opt3">1 Gbps (xy Gb data in t seconds)</option>
		<option value="bandwidth_opt4">10 Gbps (xy Gb data in t seconds)</option>
		<option value="bandwidth_opt5">100 Gbps (xy Gb data in t seconds)</option>
		<option value="default">I am not Sure</option>
	</select> --%>
	
	<s:select name="bandwidth" key="bandwidth" 
		list="#{'null':'Choose One','10-20Mbps':'10-20 Mbps (xy Gb data in t seconds)',
	'20-100Mbps':'20-100 Mbps (xy Gb data in t seconds)','1Gbps':'1 Gbps (xy Gb data in t seconds)',
	'10Gbps':'10 Gbps (xy Gb data in t seconds)','100Gbps':'100 Gbps (xy Gb data in t seconds)',
	'default':'I am not sure'}">
	</s:select>
	
	<p>Do you need VPN (or isolated) network ?</p>
	<s:select name="isolated" key="isolated" 
		list="#{'no':'No','yes':'Yes','default':'I am not sure'}">
	</s:select>
	
<%-- 	<select id="isolated" name="isolated">
		<option value="isolated_no" selected>No</option>
		<option value="isolated_yes">Yes</option>
		<option value="default">I am not Sure</option>
	</select> --%>
	
	<p>Network Layer :</p>
	<s:fielderror fieldName="layer"></s:fielderror>
	<s:select name="layer" key="layer" 
		list="#{'null':'Choose One:','l2':'Layer 2','l3':'Layer 3','default':'I am not sure'}">
	</s:select>
	
<%-- 	<select id="network_layer" name="network_layer">
		<option value="null">Choose One:</option>
		<option value="l2">L2</option>
		<option value="l3">L3</option>
		<option value="default">I am not Sure</option>
	</select> --%>
	
	<p>Public or Private IP address ?</p>
	<s:select name="ip" key="ip" 
		list="#{'public':'Public IP','private':'Private IP','default':'I am not sure'}">
	</s:select>
	
<%-- 	<select id="ip_address" name="ip_address">
		<option value="public_ip">Public IP</option>
		<option value="private_ip">Private IP</option>
		<option value="default">I am not Sure</option>
	</select> --%>
	
	<p>Do you need NFV capability ?</p>
	<s:select name="nfv" key="nfv" 
		list="#{'no':'No','yes':'Yes','default':'I am not sure' }">
	</s:select>
	
<%-- 	<select id="NFV" name="NFV">
		<option value="NFV_no" selected>No</option>
		<option value="NFV_yes">Yes</option>
		<option value="default">I am not Sure</option>
	</select> --%>
	
	<p>Which resource do you want ?</p>
	<s:select name="networkType" key="networkType" 
		list="#{'wired':'Wired Connection','sdn':'SDN','default':'I am not Sure' }">
	</s:select>
	
<%-- 	<select id="resource_type" name="resourceType">
		<option value="resourceType_wired" selected>Wired Connection</option>
		<option value="resourceType_sdn">SDN</option>
		<option value="default">I am not Sure</option>
	</select> --%>
	
	<input type="submit" value="Next">
</s:form></div>
</div>
</div>
</div>
</div>
</div>

</div>

<div class="footer text-center">
<div class="social-icons"><a href="#"><i class="facebook"></i></a>
<a href="#"><i class="twitter"></i></a> <a href="#"><i
	class="googlepluse"></i></a> <a href="#"><i class="youtube"></i></a> <a
	href="#"><i class="linkedin"></i></a></div>
<div class="copyright">
<p>Copyright &copy; 2015 All rights reserved | Template by <a
	href="http://www.baidu.com"> CustomTemplateTeam</a></p>
</div>
</div>
</body>
</html>