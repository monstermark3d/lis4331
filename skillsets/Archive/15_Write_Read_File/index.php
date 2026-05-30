<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="My online portfolio that illustrates skills acquired while working in LIS4381.">
	<meta name="author" content="Mark Trombly">
	<link rel="icon" href="favicon.ico">

	<title>LIS4381 - Write/Read File</title>
		<?php include_once("../css/include_css.php"); ?>
	
</head>
	
<body>
	<!--
Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal. 
Now we are engaged in a great civil war, testing whether that nation, or any nation so conceived and so dedicated, can long endure. We are met on a great battle-field of that war. We have come to dedicate a portion of that field, as a final resting place for those who here gave their lives that that nation might live. 
It is altogether fitting and proper that we should do this. But, in a larger sense, we can not dedicate -- we can not consecrate -- we can not hallow -- this ground. The brave men, living and dead, who struggled here, have consecrated it, far above our poor power to add or detract. 
The world will little note, nor long remember what we say here, but it can never forget what they did here. It is for us the living, rather, to be dedicated here to the unfinished work which they who fought here have thus far so nobly advanced. 
It is rather for us to be here dedicated to the great task remaining before us -- that from these honored dead we take increased devotion to that cause for which they gave the last full measure of devotion -- that we here highly resolve that these dead shall not have died in vain -- that this nation, under God, shall have a new birth of freedom -- and that government of the people, by the people, for the people, shall not perish from the earth.

Abraham Lincoln
November 19, 1863 
-->

	<?php include_once("../global/nav.php"); ?>
	
	<div class="container">
		<div class="starter-template">
			<div class="page-header">
				<?php include_once("global/header.php"); ?>	
			</div>
			
			<form class="form-horizontal" role="form" method="post" action="process.php">

					<div class="form-group">
						<label class="col-sm-2 for="comment" control-label">Comment:</label>

						<div class="col-sm-10">
								<textarea class="form-control" rows="5" name="comment" id="comment" placeholder="Please enter text here..."></textarea>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-12">
						<button type="submit" class="btn btn-default">Submit</button>
							</div>
					</div>
			</form>

			<?php include_once "global/footer.php"; ?>
			
		</div> <!-- end starter-template -->
 </div> <!-- end container -->

<!-- Bootstrap JavaScript
================================================== -->
<!-- Placed at end of document so pages load faster -->
<?php include_once("../js/include_js.php"); ?>

</body>
</html>
