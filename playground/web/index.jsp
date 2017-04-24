<%--
  Created by IntelliJ IDEA.
  User: Richard
  Date: 23/04/2017
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="elements.form" %>

<html>
  <head>
    <title>teste</title>

    <link href="assets/css/icons.css" rel="stylesheet">
    <link href="assets/css/new-btn.css" rel="stylesheet">

    <script src="https://code.jquery.com/jquery-3.2.1.min.js" ></script>

    <script>
      var num = 0;
      function teste(){ $('.num').text(++num); }
    </script>


  </head>
  <body>
  <div class="num">0</div>
  <%= new form().btn("icon-ue935-rounded-plus","teste()") %>
  <%= new form().btn("Bot&atilde;o 2","success","teste()") %>
  <%= new form().btn("icon-ue935-rounded-plus","Bot&atilde;o 3","warnning","teste()") %>
  <%= new form().btn("Bot&atilde;o 4","icon-ue935-rounded-plus","danger","teste()") %><br>
  <%= new form().btn("icon-ue935-rounded-plus","default-outline","teste()") %>
  <%= new form().btn("Bot&atilde;o 2","success-outline","teste()") %>
  <%= new form().btn("icon-ue935-rounded-plus","Bot&atilde;o 3","warnning-outline","teste()") %>
  <%= new form().btn("Bot&atilde;o 4","icon-ue935-rounded-plus","danger-outline","teste()") %>

  <script>

    $(function(){
       $('.Btn').on('click',function(){
           var btn = $(this);
           btn.prop('disabled', true);
           setTimeout(function () {
               btn.prop('disabled', false);
           }, 500);
       });
    });

  </script>

  <script src="//cdn.jsdelivr.net/mojs/latest/mo.min.js"></script>
  <script src="assets/js/btn.js"></script>

  </body>
</html>
