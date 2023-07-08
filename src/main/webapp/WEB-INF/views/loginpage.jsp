<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Customer Registration</title>
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@200;400&display=swap"
	rel="stylesheet" />
<style>
* {
	font-family: "Poppins", sans-serif;
	box-sizing: border-box;
}

h3 {
	margin-left: 40%;
	font-size: 30px;
}

a {
	margin-left: 25%;
}

.mainForm {
	width: 50%;
	border: 1px solid #d9c0f1;
	margin-left: 25%;
	box-shadow: 2px solid black;
	background-color: #e3cdf7;
	border-radius: 5px;
}

.container {
	padding: 5% 10%;
}

.form {
	border-color: 1px solid red;
}

input {
	margin-bottom: 20px;
	padding: 10px;
	width: 100%;
	border: 1px solid white;
	border-radius: 5px;
}

input:hover {
	border: 2px solid rgb(238, 84, 84);
	transition: 0.1s ease-in;
}

#button {
	cursor: pointer;
	font-size: 20px;
	background-color: rgb(238, 84, 84);
	border-radius: 15px;
	margin-left: 35%;
	width: 30%;
	color: white;
	border: 2px solid rgb(238, 84, 84);
}

#button:hover {
	background-color: rgb(79, 79, 248);
	border: 2px solid rgb(79, 79, 248);
}

#gender {
	width: 12px;
}
</style>
</head>

<body>
	<h3>Customer Login</h3>
	<div class="mainForm">
		<div class="container">
			<form action="/loginhandler" method="post">
				<label for="email">Email</label> <br /> <input type="email"
					name="email" id="email" required /> <br /> <label for="pass">Password:</label>
				<br /> <input type="password" name="pass" id="pass" required /> <br />
				<br /> <input type="submit" value="Submit" id="button" />
			</form>
		</div>
	</div>
	<a href="registration">If you are a new user Regsiter Here !</a>
</body>
</html>