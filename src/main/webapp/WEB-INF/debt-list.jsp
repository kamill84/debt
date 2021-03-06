<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Lust of all debts</title>

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



<%@ include file="/WEB-INF/navbar.jsp" %>


<h1>Debt List</h1>

<div class="container">
    <div class="row">
        <div class="col-sm-12">

            <table class="table table-striped table-bordered table-hover">
                <thead>
                <tr>
                    <th>Id</th>
                    <th>Lender</th>
                    <th>Debtor</th>
                    <th>Amount</th>
                </tr>
                </thead>
                <tbody>

                <c:forEach var="debt" items="${debts}" varStatus="loop">

                    <tr>

                        <td>${debt.id}</td>

                        <td>${debt.lenderName}<</td>

                        <td>${debt.depterName}</td>

                        <td>${debt.amount}</td>

                        <td></td>

                    </tr>

                </c:forEach>

                </tbody>
            </table>

        </div>
    </div>
</div>




</body>
</html>
