<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<html>
<head>
    <title>Login</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <script
            src="https://code.jquery.com/jquery-2.2.4.min.js"
            integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
            crossorigin="anonymous"></script>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <div class="jumbotron">

<div class="wrapper fadeInDown">
    <div id="formContent">
        <div class="fadeIn first">
            <p> Register Form </p>
        </div>

        <!-- Login Form -->
        <form action="/register" method="post">
                <input type="text" id="login" class="fadeIn second" name="firstName" required placeholder="First name">
            <p></p>
            <input type="text" id="password" class="fadeIn third" name="LastName" required placeholder="Last Name">
            <p></p>
            <input type="text" id="email" class="fadeIn third" name="email" required placeholder="Email">
            <p></p>
            <input type="password" id="password" class="fadeIn third" name="password" required placeholder="Password">
            <p></p>
            <button onsubmit="this">Register</button>



        </form>

    </div>
</div>

    </div>
</div>

</body>
</html>
