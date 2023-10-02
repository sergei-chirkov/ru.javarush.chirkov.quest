<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>

<dvi class="container h-200">
    <div class="d-flex justify-content-center">
        <div class="card mt-5 col-md-4 animated bounceInDown myForm">
            <div class="card-header">
                <form class="form-horizontal">
                    <fieldset>
                        <!-- Form Name -->
                        <legend>Game Statistics You Win</legend>
                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="userNameStatistic">userName</label>
                            <div class="col-md-4">
                                <div id="userNameStatistic" name="userName" type="text" placeholder=""
                                     class="form-control input-md"> ${requestScope.userName}</div>

                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="ipAdress">ipAdress</label>
                            <div class="col-md-4">
                                <div id="ipAdress" name="ipAdress" type="text" placeholder=""
                                     class="form-control input-md">${requestScope.ipAdress}</div>

                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="countWin">Number of wins</label>
                            <div class="col-md-4">
                                <div id="countWin" name="countWin" type="text" placeholder=""
                                     class="form-control input-md"> ${requestScope.countWin}
                                </div>

                            </div>
                        </div>
                    </fieldset>
                </form>
                <form class="form-horizontal" action="/index.jsp">
                    <button>Go to StartPage</button>
                </form>
            </div>
        </div>
    </div>
</dvi>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>
