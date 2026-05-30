<?php
//show errors: at least 1 and 4...
ini_set('display_errors', 1);
//ini_set('log_errors', 1);
//ini_set('error_log', dirname(__FILE__) . '/error_log.txt');
error_reporting(E_ALL);

//use for inital test of form inputs
//exit(print_r($_POST));

//exit(print_r($_POST)); //display $_POST array values from form

// or, for nicer display in browser...
/* echo "<pre>";
print_r($_POST);
echo "</pre>";
exit(); //stop processing, otherwise, errors below */
//After testing, comment out above lines.
               
//code to process inserts goes here
?>
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
	<?php include_once("../global/nav.php"); ?>
	
	<div class="container">
		<div class="starter-template">
			<div class="page-header">
				<?php include_once("global/header.php"); ?>	
			</div>

            <p class="text-justify">
              <?php
                $myfile = fopen("file.txt", "w+") or exit("Unable to open file!");
                $txt = $_POST['comment'];
                fwrite($myfile, $txt); // write to file
                fclose($myfile); // close file

                $myfile = fopen("file.txt", "r+") or exit("Unable to open file!");
                // output one line of text until end-of-file
                while(!feof($myfile)){
                echo fgets($myfile) . "<br/>";
                }
                fclose($myfile); //close text file
              ?>
            </p>
<?php include_once "global/footer.php"; ?>
			
		</div> <!-- end starter-template -->
 </div> <!-- end container -->

<!-- Bootstrap JavaScript
================================================== -->
<!-- Placed at end of document so pages load faster -->
<?php include_once("../js/include_js.php"); ?>

</body>
</html>
