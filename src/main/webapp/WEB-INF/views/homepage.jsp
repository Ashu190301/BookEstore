<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@200;400&display=swap"
	rel="stylesheet" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">

<style>
* {
	font-family: "Poppins", sans-serif;
	box-sizing: border-box;
}

h3 {
	margin: 5% 40%;
	font-size: 30px;
}

#imgBook {
	margin: 20% 5%;
}

#filter {
	margin-right: 2%;
	text-align: center;
}
</style>
</head>

<body>
<nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">
			<img src="https://www.pngall.com/wp-content/uploads/2018/05/Books-PNG.png" alt="" width="30" height="24" class="d-inline-block align-text-top">
			Book Store</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="/home">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="/cart">Cart</a></li>
					<li class="nav-item"><a class="nav-link" href="/vieworder">My Orders</a></li>
					<li class="nav-item"><a class="nav-link" href="/logout" onclick="alert('logged out sucessfully')">Logout</a></li>
				</ul>
				<form class="d-flex" action="/searchhandler" method="GET">
					<select id="filter" name="filter">
						<option value="title">search by title</option>
						<option value="author">search by author</option>
					</select> <input class="form-control me-2" type="search"
						placeholder="Search" aria-label="Search" id="query" name="query">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</form>
			</div>
		</div>
	</nav>

	
	
	<h3 class="text-center">Books Available</h3>
	<div class="container-md main">
		<div class="row row-cols-1 row-cols-md-3 g-4">
			<div class="col" th:each="book : ${booklist}">
				<div class="card  mb-3 h-100 border-light" style="max-width: 540px;">
					<div class="row g-0">
						<div class="col-md-4">
							<img  id="imgBook" src="https://pngimg.com/d/book_PNG51088.png"
								class="img-fluid rounded-start" alt="Book Image">
						</div>
						<div class="col-md-8">
							<div class="card-body">
								<h5 class="card-title" th:text="${book.name}"></h5>
								<p class="card-text">
									Author: <span th:text="${book.author}"></span>
								</p>
								<p class="card-text">
									Price: <span th:text="${book.price}"></span>
								</p>
								<p class="card-text">
									Quantity: <span th:text="${book.quantity}"></span>
								</p>
								<a th:href="@{/cart/{barcode}(barcode=${book.barcode})}" class="btn btn-primary" onclick="alert('Item added to cart')">Add to Cart</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
</body>

</html>
