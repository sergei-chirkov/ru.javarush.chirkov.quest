<%@ page import="ru.javarush.chirkov.quest.repository.Repository" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <title>JSP - Hello World</title>
</head>

<body>


<form action="/init" method="post">
<dvi class="container h-200">
  <div class="d-flex justify-content-center">
    <div class="card mt-5 col-md-4 animated bounceInDown myForm">
      <div class="card-header">
        <h4>Take the challenge</h4>
      </div>
      <div class="card-body">
        <form>
          <div id="dynamic_container">
            <div class="input-group">
              <div class="input-group-prepend">
                <span class="input-group-text br-15">userName<i class="fas fa-user-graduate"></i></span>
              </div>
              <input id="UserName" name="UserName" type="text" placeholder="default" class="form-control input-md">
            </div>
            <div class="input-group mt-3">
              <div class="input-group-prepend">
                <span class="input-group-text br-15">Choosing a quest<i class="fas fa-phone-square"></i></span>
              </div>
              <div class="col-md-4">
                <select id="select" name="selectbasic" class="form-control">
                  <option value="quest">quest</option>
                </select>
              </div>
            </div>
          </div>
        </form>
      </div>
      <div class="card-footer">
        <button class="btn btn-success btn-sm float-right submit_btn"><i class="fas fa-arrow-alt-circle-right"></i> Confirm</button>
      </div>
    </div>
  </div>
</dvi>
</form>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>




</body>
</html>