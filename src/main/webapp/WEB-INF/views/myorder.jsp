<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
<meta charset="ISO-8859-1">
<title>My Orders</title>
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
	margin: 5% 45%;
	font-size: 30px;
}

h5 {
	font-weight: bold;
	font-size: 20px;
}

#filter {
	margin-right: 2%;
	text-align: center;
}

#price {
	text-align: center;
	font-size: 20px;
}
#imgBook{
	margin-left: 20%;
}

</style>
</head>

<body>

	<nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://www.pngall.com/wp-content/uploads/2018/05/Books-PNG.png"
				alt="" width="30" height="24" class="d-inline-block align-text-top">
				Book Store
			</a>
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

	<h3>Orders</h3>
	<div class="container-sm">
		<table class=" table-striped table table-borderless align-middle table-responsive ">
			<tr th:each="order : ${orderlist}">
			
				<td><img id="imgBook"
						src="https://pngimg.com/d/book_PNG51088.png"
						class="d-inline-block" width="80" height="80" alt="Book Image"></td>
						
						
				<td>
					<ol class="list-group list-group-numbered">
						<li class=" d-flex justify-content-between align-items-start">
							<div class="ms-2 me-auto">
								<div>
									<h5 th:text="${order.bookName}"></h5>
								</div>
								Author : <span th:text="${order.author}"></span><br>
								Quantity : <span th:text="${order.quantity}"></span><br>
								Order Date : <span th:text="${order.orderDate}"></span><br>
								Order Time : <span th:text="${order.orderTime}"></span><br>
								Delivery Date : <span th:text="${order.deliveryDate}"></span>
							</div>
						</li>
					</ol>
				</td>
				
				<td>
					 <a
						th:href="@{/cancel/{barcode}/{orderdate}/{ordertime}(barcode=${order.barcode},orderdate=${order.orderDate},ordertime=${order.orderTime})}"
						th:classappend="${order.isDelivered}? 'disabled'" onclick="alert('order canceled for the item')"
						class="btn btn-danger">Cancel Item</a>
				</td>
				
						
			</tr>

		</table>

	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
</body>

</html>
