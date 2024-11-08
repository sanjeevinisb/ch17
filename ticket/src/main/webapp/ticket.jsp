<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>X-workz</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
body {
	background-color: 1111;
}

.registration-form {
	background-color: 2222;
	border-radius: 8px;
	padding: 50px;
	box-shadow: 0 0 10px rgba(1, 0, 1, 0);
}

h2 {
	color: 1111;
}

.btn-custom {
	background-color: #1111;
	color: #7777;
}

.form-group label {
	color: #1111111;
}

.form-control {
	border: 2px solid #007bff;
}

.form-control:focus {
	border-color: #11111;
	box-shadow: 0 0 500px rgba(1, 1, 1, 0);
}

.btn-custom {
	background-color: #111111;
	color:
}
</style>
</head>
<body>

	<h2>${Ticket}</h2>
	<div class="container mt-50">
		<div class="registration-form">
			<h2>Ticket Booking Form</h2>
			<form action="send" method="post">
				<div class="form-group">
					<label for="ticket">Ticket:</label> <input type="number"
						class="form-control" id="ticket" name="ticket" required>
				</div>

				<div class="form-group">
					<label for="contact">Contact:</label> <input type="number"
						class="form-control" id="contact" name="contact" required>
				</div>

				<div class="form-group">
					<label for="email">Email:</label> <input type="email"
						class="form-control" id="email" name="email" required>
				</div>

				<div class="form-group">
					<label for="name">Name:</label> <select id="name"
						class="form-control" id="name" name="name" required>
						<option>Select</option>
						<option>M.Chinnaswamy</option>
						<option>Nadaprabhu Kempegouda</option>
						<option>Sri Kanteerava</option>
					</select>
				</div>
				<button type="submit" class="btn btn-info">Click</button>
			</form>
		</div>

	</div>
</body>
</html>