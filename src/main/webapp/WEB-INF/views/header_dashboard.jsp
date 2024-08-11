<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>USHMA Dashboard</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="shortcut icon" href="images/favicon.png" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link href="https://fonts.googleapis.com/icon?family=Material+Symbols+Rounded" rel="stylesheet" />

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ushma/general.css" defer />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ushma/style.css" defer />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ushma/queries.css" defer />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ushma/style_dashboard.css" defer />
</head>

<style>
    /* Tooltip styling */
    .tooltip {
        position: absolute;
        background-color: #333;
        color: #fff;
        padding: 5px;
        border-radius: 3px;
        font-size: 12px;
        pointer-events: none;
        z-index: 1000;
        opacity: 0;
        transition: opacity 0.2s;
    }
</style>

<body class="grid-dash grid--6-cols">
    <aside class="sidebar">
        <div>
            <a class="sidebar-link" href="${pageContext.request.contextPath}/dashboard">
                <span class="material-symbols-rounded"> dashboard </span>
                <p>Dashboard</p>
            </a>
        </div>
        <div class="menu">
            <ul>
                <a href="${pageContext.request.contextPath}/getHotels">
                    <li class="sidebar-link">
                        <span class="material-symbols-rounded"> home </span>
                        <p>Hotels</p>
                    </li>
                </a>
                <a href="#">
                    <li class="sidebar-link">
                        <span class="material-symbols-rounded"> badge </span>
                        <p>Bookings</p>
                    </li>
                </a>
                <a href="#">
                    <li class="sidebar-link">
                        <span class="material-symbols-rounded"> message </span>
                        <p>Customers</p>
                    </li>
                </a>

                <a href="#">
                    <li class="sidebar-link">
                        <span class="material-symbols-rounded"> task </span>
                        <p>Store</p>
                    </li>
                </a>
                <a href="#">
                    <li class="sidebar-link">
                        <span class="material-symbols-rounded"> people </span>
                        <p>Products</p>
                    </li>
                </a>
                <br />
                <a href="#">
                    <li class="sidebar-link">
                        <span class="material-symbols-rounded"> settings </span>
                        <p>Bills & Reports</p>
                    </li>
                </a>
                <a href="#">
                    <li class="sidebar-link">
                        <span class="material-symbols-rounded"> support </span>
                        <p>Queries</p>
                    </li>
                </a>
                <a href="#">
                    <li class="sidebar-link">
                        <span class="material-symbols-rounded"> security </span>
                        <p>Privacy</p>
                    </li>
                </a>
            </ul>
        </div>
    </aside>

    <header>
        <button class="sidebar-toggle-button">
            <span class="material-symbols-rounded">menu</span>
        </button>
        <div class="search">
            <span class="material-symbols-rounded"> search </span>
            <input type="search" placeholder="Search for projects" />
        </div>
        <div class="notification-area">
            <span class="material-symbols-rounded"> notifications_active </span>
            <img class="profile-picture" src="${pageContext.request.contextPath}/resources/images/ushma/dash-pics/profile-pic1.png" alt="profile picture" />
            <c:choose>
                <c:when test="${not empty UserData}">
                    <p>${UserData.firstName} ${UserData.lastName}</p>
                </c:when>
                <c:otherwise>
                    <p>Admin</p>
                </c:otherwise>
            </c:choose>
        </div>
        <div class="greeting">
            <img class="user-profile-picture" src="${pageContext.request.contextPath}/resources/images/ushma/dash-pics/profile-pic1.png" alt="profile picture" />
            <div>
                <p>Hi there,</p>
                <c:choose>
                    <c:when test="${not empty UserData}">
                        <p>${UserData.firstName} ${UserData.lastName} (@${UserData.username})</p>
                    </c:when>
                    <c:otherwise>
                        <p>Admin</p>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
    </header>
</body>
</html>
