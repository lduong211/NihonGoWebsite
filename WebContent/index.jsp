<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
    <title>日本語</title>
</head>
<body>
	<header>
        <header-title>日本の勉強</header-title>
        <div class="menu-toggle"><i class="fas fa-bars"></i></div>
        <hr>
        <nav>
            <ul>
                <li class="link"><a href="./index.jsp">Home</a></li>
                <li class="link"><a href="./Detail.jsp">N5</a></li>
                <li class="link"><a href="./Detail.jsp">N4</a></li>
                <li class="link"><a href="./Detail.jsp">N3</a></li>
                <li class="link"><a href="./Happyo.jsp">Happyo</a></li>
                <li class="link"><a href="./Weekly.jsp">Weekly Vocabulary</a></li>
                <li class="link"><a href="https://e-jan.vn/" target="_blank">Urban-shop</a></li>
            </ul>
        </nav>
    </header>

    <div class="wrapper">
        <section class="title">
            <body-title>EXPERIENCE URBAN</body-title>
            <title-detail>Learning Beyond the Classroom</title-detail>
        </section>
        <section style="padding:0; margin: 0;">
            <img class="first-image" src="./images/banner-1.jpg" alt="">
        </section>
        <section>
            <div class="container">
                <div class="flex-left">
                    <img class="image-size banner-PC" src="./images/bannerHHD.jpg">
                    <img class="image-size banner-IP" src="./images/banner-2.png">
                </div>
                <div class="flex-right">
                    <div class="level-detail">LEVEL OF THE VOCABULARY</div>
                    <div class="list-level">
                        <img class="small-star" src="./images/star.svg" alt="">
                        <div class="level">N5</div>
                        <div class="detail">Basic Vocabulary</div>
                    </div>
                    <div class="list-level">
                        <img class="small-star" src="./images/star.svg" alt="">
                        <div class="level">N4</div>
                        <div class="detail">Daily Vocabulary</div>
                    </div>
                    <div class="list-level">
                        <img class="small-star" src="./images/star.svg" alt="">
                        <div class="level">N3</div>
                        <div class="detail">Advance</div>
                    </div>
                </div>
            </div>
        </section>
        <section>
            <a href="https://e-jan.vn/"><img style="width: 100%;" src="./images/e-jan.png" alt=""></a>
        </section>
        <!-- <section class="blue-background">
            <a href="http://urban-vietnam.vn/"><img style="width: 100%; height: 100%" src="./images/urban.png" alt=""></a>
        </section> -->
        <footer>
            <div style="padding-top: 5%;" class="footer-content">
                <h2 style="color: black">CONTACT ME</h2>
                <p style="color: black">95A, Nguyễn Thần Hiến, p.16, Q4, TPHCM
                </p>
                <p style="color: black">
                    info@e-jan.vn
                </p>
                <p style="color: black">
                    028 225 37034</p>
                <div class="icon">
                    <a href="https://www.facebook.com/ejanvietnam/"><img style="width: 15%;height: 15%;"  src="./images/FB.png" alt=""></a>
                    <!-- <span>tw</span>
                    <span>in</span> -->
                </div>
            </div>
        </footer>
    </div>





    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script>
        $(document).ready(function () {
            $('.menu-toggle').click(function () {
                $('nav').toggleClass('active');
            });
            $('.link').click(function () {
                $('nav').toggleClass('active');
            })
        })
    </script>
</body>
</html>