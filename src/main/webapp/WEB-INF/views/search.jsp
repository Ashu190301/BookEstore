<%@ page
	import="java.util.List, com.example.bookEstore.service.BookService, com.example.bookEstore.model.Book,
org.springframework.context.ApplicationContext, org.springframework.context.support.ClassPathXmlApplicationContext"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
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

h4 {
	margin-left: 5%;
	font-size: 15px;
}

.main {
	width: 50%;
	margin-left: 25%;
	border-radius: 5px;
}

table {
	width: 100%;
	border-collapse: collapse;
}

table td, table th {
	border: 1px solid #ddd;
	padding: 8px;
	text-align: left;
}

table tr:nth-child(even) {
	background-color: #f2f2f2;
}

table tr:hover {
	background-color: #ddd;
}

table th {
	background-color: #4CAF50;
	color: white;
}

.button {
	padding: 6px 12px;
	background-color: #5dc4e3;
	border: none;
	color: white;
	border-radius: 4px;
	cursor: pointer;
}
</style>
</head>
<body>
	<h3>Search Results</h3>
	<div class="main">
		<table>
			<tr>
				<th>Image</th>
				<th>Barcode</th>
				<th>Title</th>
				<th>Author</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Cart</th>
			</tr>
			<%
			ApplicationContext context = new ClassPathXmlApplicationContext("BookContext.xml");
			BookService bookService = (BookService) context.getBean("bookService");

			List<Book> bl = bookService.searchBookByName("Effective Java");

			for (Book rs : bl) {
			%>
			<tr>
				<td><img src="https://www.epw.in/system/files/book%20rev.png"
					alt="Book Image" height="50"></td>
				<td><%=rs.getBarcode()%></td>
				<td><%=rs.getName()%></td>
				<td><%=rs.getAuthor()%></td>
				<td><%=rs.getQuantity()%></td>
				<td><%=rs.getPrice()%></td>
				<td>
					<button class="button" onclick="addtoCart()">Add to Cart</button>
				</td>
			</tr>
			<%
			}
			%>
		</table>
	</div>
</body>
</html>
