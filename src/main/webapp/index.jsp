<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Página Inicial</title>


    <!-- Custom styles for this template -->
    
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Wendy+One&display=swap" rel="stylesheet">
	<link href="css/master.css" rel="stylesheet" />
	<link href="css/index-about.css" rel="stylesheet" />
		
</head>

<body>

<div class="page-content">
    <div class="d-flex flex-column justify-content-between align-items-center left-content">
        <a class="mt-3" asp-action="Index">
            <img src="img/logo.svg" width="100" alt="logo"/>
        </a>
        <div class="text-white d-flex justify-content-center">
            <p class="menu-title">Conheça nossos recursos exclusivos</p>
        </div>
        <div class="d-flex flex-column">
        	<a class="btn btn-warning btn-lg mb-4 menu-button" role="button" href="itemCardapio.jsp">Cardápio</a>
            <a class="btn btn-warning btn-lg mb-4 menu-button" role="button" href="about.jsp">Sobre nós</a>            
        </div>
        <a class="mb-3" style="-moz-transform: scaleX(-1); -o-transform: scaleX(-1); -webkit-transform: scaleX(-1); transform: scaleX(-1);">
            <img src="img/next.svg" class="animated-button" alt="seta para esquerda"/>
        </a>
    </div>
    <div class="right-content">
        <div>
            <div>
                <p class="page-title">Sobre o projeto</p>
            </div>
            <div class="d-flex align-items-center justify-content-around">
                <img src="img/dinnerV2.png" class="main-image" width="600" alt="mesa de jantar" />
                <p class="paragraph" style="width: 40%;">
                    O Cardapp foi criado para oferecer uma melhor experiência gastronômica utilizando IoT. Pensamos em um sistema que presasse pelo bem-estar do cliente dentro e fora de um restaurante. A ideia se baseia em um aplicativo mobile que irá controlar grande parte dos serviços manuais que já são realizados no estabelecimento.
                    Para isso acontecer, um cardápio digital será feito exclusivamente para cada restaurante, a fim de atender as necessidades de cada negócio.
                </p>
            </div>
        </div>
        <div class="d-flex flex-column align-items-center mb-5 func-disp">
            <p class="paragraph">Funcionalidades disponíveis do nosso aplicativo</p>
            <img src="img/arrowDown.png" width="100" alt="seta para baixo" />
        </div>
        <div class="d-flex align-items-center justify-content-around">
            <div style="width: 30%">
                <p class="paragraph">Todo nosso aplicativo foi projetado para o maior conforto possível de nossos clientes. Pensando nisso, criamos o recurso de acompanhar status de pedido para que o cliente saiba exatamente qual será o tempo de espera; Podendo tomar seus drinks tranquilamente</p>
            </div>
            <img src="img/AcompanharPedido.png" class="mobile-image" alt="celular" />
        </div>
        <div class="d-flex align-items-center justify-content-around mb-5">
            <img src="img/TelaSugerirMusica.png" class="mobile-image" alt="celular"/>
            <div style="width: 30%">
                <p class="paragraph">CardApp conta com uma área onde é possível escolher a música a ser tocada no ambiente (como os jukebox dos anos 1950); Trata-se de um sistema que funciona como uma fila de músicas sujeridas pelas pessoas no ambiente.</p>
            </div>
        </div>
    </div>
</div>

    <footer>
        <p>&copy; Poagilers Company</p>
    </footer>



<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-kQtW33rZJAHjgefvhyyzcGF3C5TFyBQBA13V1RKPf4uH+bwyzQxZ6CmMZHmNBEfJ" crossorigin="anonymous"></script>
</body>
</html>
