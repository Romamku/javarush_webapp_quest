<
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Prologue</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <style>
        body, h1, h2, h3, h4, h5 {
            font-family: "Raleway", sans-serif
        }
    </style>
</head>
<body class="w3-light-grey">
<div class="w3-content" style="max-width:1400px">
    <header class="w3-container w3-center w3-padding-32">
        <h1><b>ПРОЛОГ</b></h1>
        <p>Добро пожаловать в Колумбию</p>
    </header>
    <div class="w3-row">

        <div class="w3-col l7">
            <div class="w3-card-4 w3-margin w3-white">
                <img src="images/Coc.jpg" style="width:100%">
                <div class="w3-container">
                    <h3><b>МАЙАМИ</b></h3>
                    <h5>Наркоэпидемия в разгаре, <span class="w3-opacity">Август 18, 1981</span></h5>
                </div>
                <div class="w3-container">
                    <p>С начала 1970-х, когда правительство США объявило войну наркотикам, США и европейские страны
                        оказывают финансовую, материально-техническую, тактическую и военную помощь правительству
                        Колумбии в целях реализации планов по борьбе с незаконным оборотом наркотиков.</p>
                </div>
            </div>
            <hr>
            <div class="w3-card-4 w3-margin w3-white">
                <img src="images/Kartel.jpg" style="width:100%">
                <div class="w3-container">
                    <h3><b>МЕДЕЛЬИН</b></h3>
                    <h5>Медельинский картель, <span class="w3-opacity">Апрель 2, 1982</span></h5>
                </div>
                <div class="w3-container">
                    <p>Медельинский картель - самая мощная кокаиновая империя в мире. Доход от основной деятельности
                        составляет больше чем 60 миллионов долларов в день. На тотальную войну, начатую правительством
                        против них, картель отвечает террором. Стратегия состоит в терроризировании гражданского
                        населения. Картель провёл сотни террористических атак на гражданские и правительственные цели.
                        Пабло Эскобар создал террористическую группу, получившую название «Лос Экстрадитаблес». Её
                        участники совершают нападения на чиновников, полицейских, а также всех, кто выступал против
                        наркоторговли.</p>
                </div>
            </div>
        </div>
        <div class="w3-col l4">
            <div class="w3-card-4 w3-margin w3-white">
                <img src="images/Merphy.jpg" style="width:100%">
                <div class="w3-container w3-white">
                    <h4><b>Собственно о вас</b></h4>
                    <p>Вы - агент УБН (Управление по борьбе с наркотиками). Прибыли в Колумбию содействовать поимке
                        известнейшего наркобарона Пабло Эмилио Эскобара Гавирия. Один неверный шаг и вас убьют прямо на
                        улице или подставят и сдадут свои же. Не доверяйте никому и держите оружие всегда наготове.</p>
                </div>
            </div>
            <hr>
            <div class="w3-card w3-margin">
                <div class="w3-container w3-padding">
                    <h4>Полезные ссылки</h4>
                </div>
                <ul class="w3-ul w3-hoverable w3-white">
                    <li class="w3-padding-16">
                        <button class="w3-btn w3-round-large"
                                onclick="location.href='https://ru.wikipedia.org/wiki/%D0%9C%D0%B5%D0%B4%D0%B5%D0%BB%D1%8C%D0%B8%D0%BD%D1%81%D0%BA%D0%B8%D0%B9_%D0%BA%D0%BE%D0%BA%D0%B0%D0%B8%D0%BD%D0%BE%D0%B2%D1%8B%D0%B9_%D0%BA%D0%B0%D1%80%D1%82%D0%B5%D0%BB%D1%8C'">
                            Wikipedia. Медельинский картель
                        </button>
                    </li>
                    <li class="w3-padding-16">
                        <button class="w3-btn w3-round-large"
                                onclick="location.href='https://ru.wikipedia.org/wiki/%D0%9D%D0%B0%D1%80%D0%BA%D0%BE%D0%B1%D0%B8%D0%B7%D0%BD%D0%B5%D1%81_%D0%B2_%D0%9A%D0%BE%D0%BB%D1%83%D0%BC%D0%B1%D0%B8%D0%B8'">
                            Wikipedia. Наркобизнес в Колумбии
                        </button>
                    </li>
                    <li class="w3-padding-16">
                        <button class="w3-btn w3-round-large"
                                onclick="location.href='http://seasonvar.ru/serial-12216-Narki_serial_2015___psjdkhy-1-sezon.html'">
                            Seasonvar. Сериал "Наркос" смотреть
                        </button>
                    </li>
                    <li class="w3-padding-16">
                        <button class="w3-btn w3-round-large"
                                onclick="location.href='https://www.youtube.com/watch?v=ETlI7qm_ekk'">
                            Youtube. Страна Эскобара
                        </button>
                    </li>
                </ul>
            </div>
            <hr>
            <div class="w3-card w3-margin">
                <div class="w3-container w3-padding">
                    <h4>Навигация</h4>
                </div>
                <ul class="w3-ul w3-hoverable w3-white">
                    <li class="w3-padding-16">
                        <button class="w3-btn w3-round-large w3-left-align" style="width:40%" onclick="location.href='${pageContext.request.contextPath}/quest?questionId=1'"><b>Начать квест</b>
                        </button>
                    </li>
                    <li class="w3-padding-16">
                        <button class="w3-btn w3-round-large w3-left-align" style="width:40%" onclick="location.href='${pageContext.request.contextPath}'"><b>На главную</b></button>
                    </li>
                </ul>
            </div>
            <hr>
        </div>
    </div>
    <br>
</div>
</div>
</body>
</html>
