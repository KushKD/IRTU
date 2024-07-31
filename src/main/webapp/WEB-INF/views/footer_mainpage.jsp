<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>







 <footer class="footer">
         <div class="container grid grid--footer">
            <div class="logo-col">
               <a href="#" class="footer-logo">
               <img
                  class="logo"
                  alt="Ushma Wellness logo"
                  src=""
                  />
               </a>
               <ul class="social-links">
                  <li>
                     <a class="footer-link" href="#"
                        >
                        <ion-icon class="social-icon" name="logo-instagram"></ion-icon
                           >
                     </a>
                  </li>
                  <li>
                     <a class="footer-link" href="#"
                        >
                        <ion-icon class="social-icon" name="logo-facebook"></ion-icon
                           >
                     </a>
                  </li>
                  <li>
                     <a class="footer-link" href="#"
                        >
                        <ion-icon class="social-icon" name="logo-twitter"></ion-icon
                           >
                     </a>
                  </li>
               </ul>
               <p class="copyright">
                  Copyright &copy; 2024 by Ushma Wellness Retreat, Inc. All rights
                  reserved.
               </p>
            </div>
            <div class="address-col">
               <p class="footer-heading">Contact us</p>
               <address class="contacts">
                  <p class="address">
                     Ushma Wellness Retreat, Village Khail Bhaiyala (ShiloonBag), PO
                     Dharbog Tehsil, District Shimla, Himachal Pradesh
                  </p>
                  <p>
                     <a class="footer-link" href="tel:415-201-6370">xxx-xxx-6370</a
                        ><br />
                     <a class="footer-link" href="mailto:hello@ushmawellness.com"
                        >hello@ushmawellness.com</a
                        >
                  </p>
               </address>
            </div>
            <nav class="nav-col">
               <p class="footer-heading">Account</p>
               <ul class="footer-nav">
                  <li><a class="footer-link" href="#">Create account</a></li>
                  <li><a class="footer-link" href="#">Sign in</a></li>
                  <li><a class="footer-link" href="#">Android app</a></li>
               </ul>
            </nav>
            <nav class="nav-col">
               <p class="footer-heading">About UTRI</p>
               <ul class="footer-nav">
                  <li><a class="footer-link" href="#">Ushma Wellness Retreat</a></li>
                  <li><a class="footer-link" href="#">Travel Partners</a></li>
                  <li><a class="footer-link" href="#">Cooking partners</a></li>
                  <li><a class="footer-link" href="#">Careers</a></li>
               </ul>
            </nav>
            <nav class="nav-col">
               <p class="footer-heading">Resources</p>
               <ul class="footer-nav">
                  <li><a class="footer-link" href="#">Wellness Events </a></li>
                  <li><a class="footer-link" href="#">Benefits</a></li>
                  <li><a class="footer-link" href="#">Membership</a></li>
                  <li><a class="footer-link" href="#">Privacy & terms</a></li>
               </ul>
            </nav>
         </div>
      </footer>
      <script src="${pageContext.request.contextPath}/resources/js/ushma/jquery-3.1.0.min.js"></script>
      <script src="${pageContext.request.contextPath}/resources/js/ushma/vegas.min.js"></script>
      <script src="${pageContext.request.contextPath}/resources/js/ushma/script.js"></script>
   </body>
</html>