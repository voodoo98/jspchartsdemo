<!DOCTYPE html>
<html>
<head>
    <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"  integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css">
    <link href="css/bootstrap-toggle.min.css" rel="stylesheet">
    <script src="js/bootstrap-toggle.min.js"></script>
    <script src="js/chart.js"></script>
    <script src="js/demochart.js"></script>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
    <%@ page session="true" %>
    <title>Charts</title>
</head>
<script>
    getDailyLineChart('Daily Line chart');
    getDailyBarChart('Daily Bar chart');
    getDailyPieChart('Daily Donut chart');
</script>
<body>
    <div class="mb-5" style="overflow-x: hidden">
        <div class="d-flex justify-content-center row">
            <div class="col-3 shadow p-3 m-3 bg-body rounded" >
                <jsp:include page="/WEB-INF/jsp/dashboard/line-chart.jsp"/>
            </div>
            <div class="col-3 shadow p-3 m-3 bg-body rounded">
                <jsp:include page="/WEB-INF/jsp/dashboard/bar-chart.jsp"/>
            </div>
            <div class="col-3 shadow p-3 m-3 bg-body rounded">
                <jsp:include page="/WEB-INF/jsp/dashboard/pie-chart.jsp"/>
            </div>
        </div>
    </div>
</body>
</html>