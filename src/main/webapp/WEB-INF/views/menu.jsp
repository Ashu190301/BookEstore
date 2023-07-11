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
					<li class="nav-item"><a class="nav-link" href="/logout">Logout</a></li>
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
