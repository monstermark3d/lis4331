<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="My online portfolio that illustrates skills acquired while working in LIS4381.">
	<meta name="author" content="Mark Trombly">
	<link rel="icon" href="favicon.ico">

	<title>LIS4381 - Simple Calculator</title>
		<?php include_once("../css/include_css.php"); ?>
	
</head>
	
<body>
	

	<?php include_once("../global/nav.php"); ?>
	
	<div class="container">
		<div class="starter-template">
			<div class="page-header">
				<?php include_once("global/header.php"); ?>	
			</div>
		
			<form class="form-horizontal" role="form" method="post" action="process_functions.php">
			  <div class="form-group">
				<label class="control-label col-sm-2" for="num1">Num 1:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="num1" id="num1" placeholder="Enter First Number"/>
				</div>
			  </div>

			  <div class="form-group">
				<label class="control-label col-sm-2" for="num2">Num 2:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="num2" id="num2" placeholder="Enter Second Number"/>
				</div>
			  </div>

			  <div class="form-group">
				<div class="col-sm-12">
				  <label class="checkbox-inline">
					<input type="radio" name="operation" id="addition" value="addition" checked="true">Addition
				  </label>

				  <label class="checkbox-inline">
					<input type="radio" name="operation" id="subtraction" value="subtraction">Subtraction
				  </label>

				  <label class="checkbox-inline">
					<input type="radio" name="operation" id="multiplication" value="multiplication">Multiplication
				  </label>

				  <label class="checkbox-inline">
					<input type="radio" name="operation" id="division" value="division">Division
				  </label>

				  <label class="checkbox-inline">
					<input type="radio" name="operation" id="exponentiation" value="exponentiation">Exponentiation
				  </label>

			     </div>
			  </div>

			  <div class="form-group">
				<div class="col-sm-12">
				  <button type="submit" class="btn btn-default">Calculate</button>
				</div>
			  </div>
			</form>

			<?php include_once "../global/footer.php"; ?>
			
		</div> <!-- end starter-template -->
 </div> <!-- end container -->

	<!-- Bootstrap JavaScript
	================================================== -->
	<!-- Placed at end of document so pages load faster -->
			<?php include_once("../js/include_js.php"); ?>



</body>
</html>
