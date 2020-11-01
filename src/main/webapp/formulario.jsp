<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="height: 100%; min-height: 100%">
<head lang="pt-BR">
<meta charset="UTF-8">
<title>Envio de Mensagem</title>
<link rel="stylesheet" href="./static/bootstrap/css/bootstrap.min.css">
</head>
<body class="bg-light"
	style="display: flex; flex-direction: column; min-height: 100%">
	<div class="container">
		<div class="py-5 text-center">
			<h1>Formulário de Mensagem</h1>
			</br>
			<p class="lead">Digite os dados para enviar a mensagem:</p>
		</div>
		<form action="goMessage">
			<div class="form-group ">
				<label for="destinatario">Número destinatário:</label> 
				<input type="text" class="form-control" id="destinatario" name="destinatario"></br>
				<div class="form-group">
					<label for="msg">Mensagem:</label>
					<textarea class="form-control" id="msg"rows="3" name="msg"></textarea>
				</div>
			</div>
			<div class="text-right">
				<button type="submit" class="btn btn-primary">Enviar</button>
			</div>
		</form>
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="./static/bootstrap/js/bootstrap.min.js"></script>
	<footer class="footer mt-auto py-1"
		style="background-color: #000; color: #FFF">
		<p class="text-center small">&copy;2020 Desenvolvido por Rodrigo
			Franco - Todos os direitos reservados.</p>
	</footer>
</body>
</html>