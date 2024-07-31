<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
   <head>
      <meta charset="UTF-8" />
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />
      <!-- Always include this line of code!!! -->
      <meta name="viewport" content="width=device-width, initial-scale=1.0" />
      <link rel="preconnect" href="https://fonts.gstatic.com" />
      <link
         href="https://fonts.googleapis.com/css2?family=Rubik:wght@400;500;600;700&display=swap"
         rel="stylesheet"
         />
      <!-- Include Font Awesome -->
      <link
         rel="stylesheet"
         href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css"
         />
      <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ushma/general.css" />
      <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ushma/style.css" />
      <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ushma/queries.css" />
      <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ushma/vegas.min.css" />
      <script
         type="module"
         src="https://unpkg.com/ionicons@5.4.0/dist/ionicons/ionicons.esm.js"
         ></script>
      <script
         nomodule=""
         src="https://unpkg.com/ionicons@5.4.0/dist/ionicons/ionicons.js"
         ></script>
      <title>Ushma Welness Retreat</title>
   </head>
    <body>
         <header class="header">
            <a href="#">
            <img
               class="logo"
               alt="Ushma Wellness Retreat logo"
               src=""
               />
            </a>
            <nav class="main-nav">
               <ul class="main-nav-list">
                  <li><a class="main-nav-link" href="#">The Retreat</a></li>
                  <li>
                     <a class="main-nav-link" href="#">Registrations & Affiliation</a>
                  </li>
                  <li><a class="main-nav-link" href="#">News & Events</a></li>
                  <li><a class="main-nav-link" href="#">Shop</a></li>
                  <li><a class="main-nav-link" href="#">About Us</a></li>
                  <li><a class="main-nav-link" href="#">Contact Us</a></li>
                  <li><a class="main-nav-link" href="#">Blog</a></li>
                  <li><a class="main-nav-link nav-cta" href="#">Book Your Stay</a></li>
               </ul>
            </nav>
            <button class="btn-mobile-nav">
               <ion-icon class="icon-mobile-nav" name="menu-outline"></ion-icon>
               <ion-icon class="icon-mobile-nav" name="close-outline"></ion-icon>
            </button>
         </header>