<html>
<head>
  <title>Simple Form</title>
</head>
<body>

<h1>Data</h1>

<p>URL parameters:</p>
<?php
foreach($_GET as $key => $value){
  echo $key . " : " . $value . "<br />\r\n";
}
?>


<p>POST data:</p>
<table>
<?php
    foreach ($_POST as $key => $value) {
        echo "<tr>";
        echo "<td>";
        echo $key;
        echo "</td>";
        echo "<td>";
        echo $value;
        echo "</td>";
        echo "</tr>";
    }
?>
</table>

<h1>Simple GET Form</h1>
<form action="form.php" method="GET">
Field 1: <input type="input" id="field1" name="field1" />
Field 2: <input type="input" id="blah" name="blah" />
<input type="submit" />
</form>


<h1>Simple POST Form</h1>
<form action="form.php" method="POST">
Field 1: <input type="input" id="field1" name="field1" />
<input type="submit" />
</form>


</body>
</html>
