<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Title</title>
    <!-- css-->
    <link href="${pageContext.request.contextPath}/resources/css/abc.css" rel="stylesheet" type="text/css">
    <link href="<c:url value="/resources/jquery-ui/jquery-ui.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<c:url value="/resources/jtable/themes/metro/blue/jtable.min.css"/>" rel="stylesheet" type="text/css">


    <!-- js -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="<c:url value="/resources/jquery-ui/jquery-ui.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/jtable/jquery.jtable.min.js"/>" type="text/javascript"></script>
</head>
<body>

<h1>People of Hanoi</h1>

<div class="filtering">
    <form>
        Name: <input type="text" name="name" id="name" />
        CCCD: <input type="text" name="identityCard" id="identityCard" />
        <button type="submit" id="searchButton">Search</button>
    </form>
</div>
<div id="PersonTableContainer"></div>

<script type="text/javascript">
    $(document).ready(function () {
        $('#PersonTableContainer').jtable({
            title: 'Table of people',
            actions: {
                listAction: '/Demo_war_exploded/listPerson',
                createAction: '/Demo_war_exploded/addPerson',
                updateAction: '/Demo_war_exploded/updatePerson',
                deleteAction: '/Demo_war_exploded/deletePerson'
            },
            fields: {
                id: {
                    key: true,
                    list: false
                },
                name: {
                    title: 'Tên',
                    width: '20%'
                },
                identityCard: {
                    title: 'Cccd',
                    width: '15%'
                },
                // bod: {
                //     title: 'Ngày sinh',
                //     width: '10%',
                //     type: 'date',
                //     displayFormat:'yy-mm-dd'
                //     // visibility: 'hidden'
                // },
                phone: {
                    title: "SDT",
                    visibility: 'hidden'
                },

                address: {
                    title: "Địa chỉ",
                    visibility: 'hidden'
                },
                ward: {
                    title: 'Phường',
                    width: '15%',
                },
                district: {
                    title: 'Quận',
                    width: '15%',
                }
            }
        });

        $('#searchButton').click(function (e) {
            e.preventDefault();
            $('#PersonTableContainer').jtable('load', {
                name: $('#name').val(),
                identityCard: $('#identityCard').val()
            });
        });

        $('#searchButton').click();
    });
</script>

</body>
</html>
