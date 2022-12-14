<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>


<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
>
<head>
    <meta charset="UTF-8">
    <title>Пополнение карты</title>
    <link rel="stylesheet" href="../../webapp/resources/style.css">
    <style>
        header {
            background-color: lightskyblue;
            border-radius: 10px;
            text-align: center;
        }

        #Line {
            position: static;
            margin: 7px;
            padding: 10px;
            border: 4px black;
            background: #e1cc78;
            text-align: center;
            margin: 120px;
            top: 100px;
            border-radius: 5px;
        }

        #Line1 {
            width: 100%;
            padding: 10px;
            color: coral;
            border-radius: 5px;
        }

        #Line2 {
            width: 100%;
            padding: 10px;
            color: coral;
            border-radius: 5px;
        }

        #Line3 {
            position: static;
            width: 100%;
            height: 30px;
            padding: 10px;
            color: coral;
            border-radius: 5px;
        }

        #Line4 {
            position: static;
            width: 100%;
            height: 30px;
            padding: 10px;
            color: coral;
            border-radius: 5px;
        }

        #tab {
            width: 100%;
            border: 1px solid black;

            border-radius: 5px;
        }

        tr {
            border: 1px solid grey;
        }

        th {
            border: 1px solid grey;
        }

        #Go {
            width: 200px;
            height: 70px;
        }

        body {
            background: #FAFAD2;
        }

    </style>
</head>

<body>
<div id="Line">
    <form action="refill" method="post">
        <div>
            <label for="say">Номер карты</label>
            <input name="number" id="say">
        </div>

        <div>
            <label for="sum">Сумма</label>
            <input name="sum" id="sum">
        </div>
        <div>
            <label for="pin">Pin</label>
            <input name="pin" id="pin">
        </div>

        <div>
            <button>Go</button>
        </div>
    </form>

</div>

</body>
</html>