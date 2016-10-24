<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Computation</title>
<script>
	function toggleGpuRamSize() {
		var gpu = document.getElementById("dedicated_GPU_requirement").value; 
		var gpuSize = document.getElementById("dynamic_gpu_size");
		if (gpu == "yes") {
			var text = "<p>GPU Ram Size</p>" + "<select id=\"gpu_RAM\" name=\"gpu_RAM\"> \
			<option value=\"null\" selected>Choose One:</option> \
			<option value=\"gpu_size_1\">512MB - 1GB</option> \
			<option value=\"gpu_size_2\">1GB - 2GB</option> \
			<option value=\"gpu_size_3\">2Gb - 4GB</option> \
			<option value=\"gpu_size_4\">4Gb - 8GB</option> \
			<option value=\"gpu_size_5\">8Gb - 16GB</option> \
			<option value=\"gpu_size_6\">16Gb - 32GB</option> \
			</select>";
			gpuSize.innerHTML = text;
		} else {
			gpuSize.innerHTML = "";
		}
	}
</script>
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
	<li><a href="about.hmtl">About Us</a></li>
	<li><a href="services.html">Services</a></li>
	<li><a href="login.jsp">Account</a></li>
	<li><a class="active" href="computation.jsp">Start</a></li>
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
<h3>Step 4/5 : Computation</h3>
<div class="container">
<div class="row">
<div class="col-md-8 contact_left">
<h4>Computation Resources Identifier</h4>
   					<p class="m_6">In this step, we only focus on the Computation resources of the template. 
   					<br>
   					Computation resources mainly include the types of the Server, such as Virtual Server or Dedicated Server, the sizes of the cores about CPU, the size of RAM and so on.
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
						          <strong>What is virtual server?</strong>
						        </a>
						      </h5>
						    </div>
						    <div id="collapseOne" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingOne">
						      <div class="panel-body">
						        	Virtual Web servers are a very popular way of providing low-cost web hosting services. Instead of requiring a separate computer for each server, dozens of virtual servers can co-reside on the same computer. In most cases, performance is not affected and each web site behaves as if it is being served by a dedicated server. However, if too many virtual servers reside on the same computer, or if one virtual server starts hogging resources, Web pages will be delivered more slowly.
						         </div>
						    </div>
						  </div>
					  
				
						  <!-- Q2 -->
						  <div class="panel panel-default">
						    <div class="panel-heading" role="tab" id="headingTwo">
						      <h5 class="panel-title">
						        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
						          <strong>What is the virtual CPU?</strong>
						        </a>
						      </h5>
						    </div>
						    <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
						      <div class="panel-body">
						       		 A virtual CPU (vCPU) also known as a virtual processor, is a physical central processing unit (CPU) that is assigned to a virtual machine (VM).
By default, virtual machines are allocated one vCPU each. If the physical host has multiple CPU cores at its disposal, however, then a CPU scheduler assigns execution contexts and the vCPU essentially becomes a series of time slots on logical processors.
						        </div>
						    </div>
						  </div>
					
						  <!-- Q3 -->
						  <div class="panel panel-default">
						    <div class="panel-heading" role="tab" id="headingThree">
						      <h5 class="panel-title">
						        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
						          <strong>What is the virtual memory?</strong>
						        </a>
						      </h5>
						    </div>
						    <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
						      <div class="panel-body">
						        	Virtual memory combines your computer��s RAM with temporary space on your hard disk. When RAM runs low, virtual memory moves data from RAM to a space called a paging file. Moving data to and from the paging file frees up RAM so your computer can complete its work.

The more RAM your computer has, the faster your programs will generally run. If a lack of RAM is slowing your computer, you might be tempted to increase virtual memory to compensate. However, your computer can read data from RAM much more quickly than from a hard disk, so adding RAM is a better solution.
						      </div>
						    </div>
						  </div>
						  
						  <!-- Q4 -->
						  <div class="panel panel-default">
						    <div class="panel-heading" role="tab" id="headingFour">
						      <h5 class="panel-title">
						        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
						          <strong>What is the dedicated server?</strong>
						        </a>
						      </h5>
						    </div>
						    <div id="collapseFour" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFour">
						      <div class="panel-body">
						       	A dedicated server is a single computer in a network reserved for serving the needs of the network. For example, some networks require that one computer be set aside to manage communications between all the other computers. A dedicated server could also be a computer that manages printer resources. Note, however, that not all servers are dedicated. In some networks, it is possible for a computer to act as a server and perform other functions as well.
						      </div>
						    </div>
						  </div>
						  
						 <!-- Q5 -->
						  <div class="panel panel-default">
						    <div class="panel-heading" role="tab" id="headingFive">
						      <h5 class="panel-title">
						        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseFive" aria-expanded="false" aria-controls="collapseFive">
						          <strong>What is the dedicated GPU?</strong>
						        </a>
						      </h5>
						    </div>
						    <div id="collapseFive" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFive">
						      <div class="panel-body">
						       	GPU-accelerated computing is the use of a graphics processing unit (GPU) together with a CPU to accelerate scientific, analytics, engineering, consumer, and enterprise applications. Pioneered in 2007 by NVIDIA, GPU accelerators now power energy-efficient datacenters in government labs, universities, enterprises, and small-and-medium businesses around the world. GPUs are accelerating applications in platforms ranging from cars, to mobile phones and tablets, to drones and robots.
						      </div>
						    </div>
						  </div>
						  
						  <!-- Q6 -->
						  <div class="panel panel-default">
						    <div class="panel-heading" role="tab" id="headingSix">
						      <h5 class="panel-title">
						        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseSix" aria-expanded="false" aria-controls="collapseSix">
						          <strong>What is the hypervisor?</strong>
						        </a>
						      </h5>
						    </div>
						    <div id="collapseSix" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingSix">
						      <div class="panel-body">
						       	A hypervisor or virtual machine monitor (VMM) is a piece of computer software, firmware or hardware that creates and runs virtual machines.

A computer on which a hypervisor is running one or more virtual machines is defined as a host machine. Each virtual machine is called a guest machine. The hypervisor presents the guest operating systems with a virtual operating platform and manages the execution of the guest operating systems. Multiple instances of a variety of operating systems may share the virtualized hardware resources.
						      </div>
						    </div>
						  </div>
						  
						  <!-- Q7 
						  <div class="panel panel-default">
						    <div class="panel-heading" role="tab" id="headingSeven">
						      <h5 class="panel-title">
						        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseSeven" aria-expanded="false" aria-controls="collapseSeven">
						          <strong>How to know which OS is matchable for you?</strong>
						        </a>
						      </h5>
						    </div>
						    <div id="collapseSeven" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingSeven">
						      <div class="panel-body">
						       	11111111
						      </div>
						    </div>
						  </div>
						  -->
						  <!-- Q8 
						  <div class="panel panel-default">
						    <div class="panel-heading" role="tab" id="headingEight">
						      <h5 class="panel-title">
						        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseEight" aria-expanded="false" aria-controls="collapseEight">
						          <strong>How to know which process is matchable for you?</strong>
						        </a>
						      </h5>
						    </div>
						    <div id="collapseEight" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingEight">
						      <div class="panel-body">
						       	11111111
						      </div>
						    </div>
						  </div>
						  -->
						  <!-- Q9 
						  <div class="panel panel-default">
						    <div class="panel-heading" role="tab" id="headingNine">
						      <h5 class="panel-title">
						        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseNine" aria-expanded="false" aria-controls="collapseNine">
						          <strong>How to calculate the size of your RAM?</strong>
						        </a>
						      </h5>
						    </div>
						    <div id="collapseNine" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingNine">
						      <div class="panel-body">
						       	11111111
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
						<s:form action="setComputationReq" method="post" namespace="/">
						
							<p><s:text name="noOfNodes"></s:text></p>
							<s:fielderror fieldName="noOfNodes"></s:fielderror>
							<s:select name="noOfNodes" id="noOfNodes" key="noOfNodes" headerKey="null"
								headerValue="Choose one" list="noOfNodesList">
							</s:select>
							
							<p><s:text name="noOfCores"></s:text></p>
							<s:fielderror fieldName="noOfCores"></s:fielderror>
							<s:select name="noOfCores" id="noOfCores" key="noOfCores" headerKey="null"
								headerValue="Choose one" list="noOfCoresList">
							</s:select>
							
							<p><s:text name="dedicatedServer"></s:text></p>
							<s:fielderror fieldName="dedicatedServer"></s:fielderror>
							<s:select name="dedicatedServer" id="dedicatedServer" key="dedicatedServer" headerKey="null"
								headerValue="Choose one" list="yesOrNoList">
							</s:select>
							
							<p><s:text name="operatingSystem"></s:text></p>
							<s:fielderror fieldName="operatingSystem"></s:fielderror>
							<s:select name="operatingSystem" id="operatingSystem" key="operatingSystem" headerKey="null" 
								headerValue="Choose one" list="osList">
							</s:select>
							
							<p><s:text name="osArchitecture"></s:text></p>
							<s:fielderror fieldName="osArchitecture"></s:fielderror>
							<s:select name="osArchitecture" id="osArchitecture" key="osArchitecture" headerKey="null"
								headerValue="Choose one" list="osArchList">
							</s:select>
							
							<p><s:text name="ramSize"></s:text></p>
							<s:fielderror fieldName="ramSize"></s:fielderror>
							<s:select name="ramSize" id="ramSize" key="ramSize" headerKey="null"
								headerValue="Choose one" list="ramSizeList">
							</s:select>
							
							<p><s:text name="gpu"></s:text></p>
							<s:fielderror fieldName="gpu"></s:fielderror>
							<s:doubleselect name="gpu" key="gpu" headerKey="null" headerValue="Choose one" 
								list="gpuMap.keySet()" value="getDefaultGpu" 
								doubleName="gpuSize" doubleListTitle="GPU Size" doubleList="gpuMap.get(top)">
							</s:doubleselect>
							
							<input type="submit" value="Next">
						</s:form></div>
					</div>
				</div>
				
			</div>
		</div>
	</div>
</div>
<!-- End of content -->


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