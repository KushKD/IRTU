<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/flatpickr/dist/flatpickr.min.css">

<main>
   <section class="section-hero slider">
      <div class="hero">
         <div class="hero-text-box">
            <h1 class="heading-primary">USHMA WELLNESS RETREAT</h1>
            <p class="hero-description">
               A Bluezone Valley Offering Holistic Wellness and Unmatched Comfort
            </p>
            <a href="${pageContext.request.contextPath}/login" class="btn btn--full margin-right-sm">Book Your Stay</a>
            <a href="#" class="btn btn--outline">Learn more &darr;</a>
            <div class="delivered-meals">
               <div class="delivered-imgs">
                  <img
                     src="${pageContext.request.contextPath}/resources/images/ushma/customers/customer-1.jpg"
                     alt="Customer photo"
                     />
                  <img
                     src="${pageContext.request.contextPath}/resources/images/ushma/customers/customer-2.jpg"
                     alt="Customer photo"
                     />
                  <img
                     src="${pageContext.request.contextPath}/resources/images/ushma/customers/customer-3.jpg"
                     alt="Customer photo"
                     />
                  <img
                     src="${pageContext.request.contextPath}/resources/images/ushma/customers/customer-4.jpg"
                     alt="Customer photo"
                     />
                  <img
                     src="${pageContext.request.contextPath}/resources/images/ushma/customers/customer-5.jpg"
                     alt="Customer photo"
                     />
                  <img
                     src="${pageContext.request.contextPath}/resources/images/ushma/customers/customer-6.jpg"
                     alt="Customer photo"
                     />
               </div>
               <p class="delivered-text"><span>2,500+</span> Happy Customers!</p>
            </div>
         </div>
      </div>
   </section>

     <section>
       <div class="container">
          <form:form method="POST" modelAttribute="bookForm" action="${pageContext.request.contextPath}/bookRoom" class="cta-form-book-hotel meal">
             <div><h1 class="heading-book-hotel">Book Your Room Today</h1></div>
              <div class="dates-grid"><label class="sub-heading-book-hotel" for="checkInOutDate">Select Check-In and Check-Out Dates:</label>
              <spring:bind path="checkIncheckOut">
                  <div class="${status.error ? 'has-error' : ''}">
                  <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="checkIncheckOut" name="checkIncheckOut" placeholder="Select Booking Dates"  id="checkInOutDate"  required="true"></form:input>
                  <form:errors  path="checkIncheckOut"></form:errors>
                  </div>
              </spring:bind>
              <br><br>
              <button type="submit" class="btn btn--full margin-right-sm">Book Now</button>
              <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
              <c:remove var="successMessage" scope="session" />
             </div>
          </form:form>
       </div>

    </section>

   <section class="section-featured">
      <div class="container">
         <h2 class="heading-featured-in">Featured in</h2>
         <div class="logos">
            <img src="${pageContext.request.contextPath}/resources/images/ushma/logos/TripAdvisor.png" alt="Trip Advisor logo" />
            <img src="${pageContext.request.contextPath}/resources/images/ushma/logos/Makemytrip.png" alt="Make My Trip Logo" />
            <img src="${pageContext.request.contextPath}/resources/images/ushma/logos/Trip.com.png" alt="Trip Logo" />
            <img src="${pageContext.request.contextPath}/resources/images/ushma/logos/Agoda.png" alt="Agora logo" />
            <img src="${pageContext.request.contextPath}/resources/images/ushma/logos/Thomas.jpg" alt="Thomas Cook logo" />
         </div>
      </div>
   </section>
   <!-- Section Wellness Tharipies-->
   <section
      class="container text-center"
      style="padding: 10px; margin-top: 60px"
      >
      <span class="subheading center-text"> Gatherings & Events</span>
      <h2 class="heading-secondary center-text" style="color: #545454">
         Upcoming Events
      </h2>
      <div class="grid grid--2-cols">
         <!-- Upcoming events grid -->
         <div class="scroll-container">
            <div class="homes">
               <div class="home">
                  <img
                     src="${pageContext.request.contextPath}/resources/images/ushma/events/event-food.jpg"
                     alt="House 1"
                     class="home__img"
                     />
                  <h5 class="home__name">Organic Food Events</h5>
               </div>
            </div>
         </div>
         <!-- Upcoming events grid -->
         <div
            class="marquee-container"
            style="margin: 8rem 0; background-color: #FFF"
            >
            <div>
               <h2 class="heading">Upcoming Events</h2>
            </div>
            <div class="marquee">
               <div class="event">
                  <h5 class="event__name">Upcoming Event 1</h5>
                  <p class="event__details">Details about upcoming event 1.</p>
               </div>
               <div class="event">
                  <h5 class="event__name">Upcoming Event 2</h5>
                  <p class="event__details">Details about upcoming event 2.</p>
               </div>
               <div class="event">
                  <h5 class="event__name">Upcoming Event 3</h5>
                  <p class="event__details">Details about upcoming event 3.</p>
               </div>
               <div class="event">
                  <h5 class="event__name">Upcoming Event 4</h5>
                  <p class="event__details">Details about upcoming event 4.</p>
               </div>
               <div class="event">
                  <h5 class="event__name">Upcoming Event 5</h5>
                  <p class="event__details">Details about upcoming event 5.</p>
               </div>
            </div>
         </div>
   </section>
   <!-- Section Wellness Tharies End-->
   <section class="section-meals">
   <div class="container center-text">
   <span class="subheading">Room Types</span>
   <h2 class="heading-secondary" style="color: #545454">
   Hotel Rooms Available
   </h2>
   </div>
   <div class="container grid grid--3-cols margin-bottom-md">
   <div class="meal">
   <img src="${pageContext.request.contextPath}/resources/images/ushma/rooms/room1.jpg" class="meal-img" alt="Suits" />
   <div class="meal-content">
   <div class="meal-tags">
   <span class="tag tag--vegetarian">In-room yoga</span>
   <span class="tag tag--paleo">Nature Retreate</span>
   </div>
   <p class="meal-title">Superior Rooms</p>
   <ul class="meal-attributes">
   <li class="meal-attribute">
   <ion-icon class="meal-icon" name="flame-outline"></ion-icon>
   <span><strong>10000/- </strong> per night</span>
   </li>
   <li class="meal-attribute">
   <ion-icon
      class="meal-icon"
      name="restaurant-outline"
      ></ion-icon>
   <span>Wellness Score &reg; <strong>94</strong></span>
   </li>
   <li class="meal-attribute">
   <ion-icon class="meal-icon" name="star-outline"></ion-icon>
   <span><strong>4.9</strong> rating (537)</span>
   </li>
   </ul>
   </div>
   </div>
   <div class="meal">
   <img
      src="${pageContext.request.contextPath}/resources/images/ushma/rooms/room2.jpg"
      class="meal-img"
      alt="Avocado Salad"
      />
   <div class="meal-content">
   <div class="meal-tags">
   <span class="tag tag--vegan">YOGA</span>
   <span class="tag tag--paleo">Wellness</span>
   </div>
   <p class="meal-title">Deluxe Rooms</p>
   <ul class="meal-attributes">
   <li class="meal-attribute">
   <ion-icon class="meal-icon" name="flame-outline"></ion-icon>
   <span><strong>6000/- </strong> per night</span>
   </li>
   <li class="meal-attribute">
   <ion-icon
      class="meal-icon"
      name="restaurant-outline"
      ></ion-icon>
   <span>Wellness Score &reg; <strong>92</strong></span>
   </li>
   <li class="meal-attribute">
   <ion-icon class="meal-icon" name="star-outline"></ion-icon>
   <span><strong>4.8</strong> rating (441)</span>
   </li>
   </ul>
   </div>
   </div>
   <div class="diets">
   <h3 class="heading-tertiary" style="color: #545454">Amenities:</h3>
   <ul class="list">
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span> <i class="fas fa-wifi"></i> &nbsp; Free WiFi</span>
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>
   <i class="fa-solid fa-lock"></i> &nbsp;In-Room Safe</span
      >
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>
   <i class="fa-solid fa-desktop"></i> &nbsp; Workstations </span
      >
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>
   <i class="fa-sun-o"></i> &nbsp; Central Room Heating</span
      >
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>
   <i class="fa-solid fa fa-car"></i> &nbsp; 24x7  Transportation</span
      >
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span> <i class="fa-solid fa fa-cutlery"></i> &nbsp; Roof Top Resturant (360 View)</span>
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>
   <i class="fa-solid fa fa-tint"></i> &nbsp; All Weather Swimming Pool
   </span
      >
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>
   <i class="fa-solid fa fa-child"></i>
   &nbsp; Special Child Care Facility</span
      >
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>
   <i class="fa-solid fa-futbol-o"></i>
   &nbsp; 25+ Sports and Activities </span
      >
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>
   <i class="fa-solid fa-car"></i>
   &nbsp; Car parking and Washing </span
      >
   </li>
   </ul>
   </div>
   </div>
   <div class="container grid">
   <aside class="plan-details">
   Prices include all applicable taxes. You can cancel at any time.
   Both plans include the following:
   </aside>
   </div>
   <div class="container grid grid--4-cols">
   <div class="feature">
   <ion-icon class="feature-icon" name="infinite-outline"></ion-icon>
   <p class="feature-title">Food and Cuisine</p>
   <p class="feature-text">
   Rejuvenate Your Spirit: Experience VAT, PIT, and KAF Yoga Retreats at Our Hotel!
   </p>
   </div>
   <div class="feature">
   <ion-icon class="feature-icon" name="nutrition-outline"></ion-icon>
   <p class="feature-title">Local and organic</p>
   <p class="feature-text">
   Our cooks only use local, fresh, and organic products to prepare
   your meals.
   </p>
   </div>
   <div class="feature">
   <ion-icon class="feature-icon" name="leaf-outline"></ion-icon>
   <p class="feature-title">Events</p>
   <p class="feature-text">
   All our partners only use reusable containers to package all your
   meals.
   </p>
   </div>
   <div class="feature">
   <ion-icon class="feature-icon" name="pause-outline"></ion-icon>
   <p class="feature-title">Wellness Therepies</p>
   <p class="feature-text">
   Going on vacation? Just pause your subscription, and we refund
   unused days.
   </p>
   </div>
   </div>
   <div class="container all-recipes">
   <a href="#" class="link">View More &rarr;</a>
   </div>
   </section>
   <section style="display:grid;  margin-bottom: 10rem;" class="container grid--2-col grid--center-v">
   <div>
   <div class="story__pictures grid">
   <img src="${pageContext.request.contextPath}/resources/images/ushma/story/sports1.jpg" alt="Couple with new house" class="story__img--1">
   </div>
   </div>
   </div>
   <div class="story__content">
   <div class="container center-text" style="padding:1rem">
   <span class="subheading">Fun and Energy</span>
   <h2 class="heading-secondary" style="color: #545454">
   Sports & Amenities
   </h2>
   </div>
   <div style="display: grid;" class="container grid--3-cols margin-bottom-md">
   <div class="diets" >
   <h3 class="heading-tertiary" style="color: #545454">YOGA</h3>
   <ul class="list">
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>  YOGA</span>
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span
      > SPA</span
      >
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>
   SONA</span
      >
   </li>
   </ul>
   </div>
   <div class="diets">
   <h3 class="heading-tertiary" style="color: #545454">Indoor</h3>
   <ul class="list">
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span> Chess</span>
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span
      > Childrenzone</span
      >
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>
   Gymnesium</span
      >
   </li>
   </ul>
   </div>
   <div class="diets">
   <h3 class="heading-tertiary" style="color: #545454">Outdoor</h3>
   <ul class="list">
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>Badminton</span>
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span
      > Volleyball</span
      >
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>
   Basketball</span
      >
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>
   Swimming</span
      >
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>
   Foxfly/Zipline</span
      >
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>
   Biking</span
      >
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   Hiking</span>
   </li>
   <li class="list-item">
   <ion-icon class="list-icon" name="checkmark-outline"></ion-icon>
   <span>
   Treking  </span
      >
   </li>
   </ul>
   </div>
   </div>
   </div>
   </div>
   </section>
   <!-- Image Galary -->
   <section class="gallery">
      <figure class="gallery__item gallery__item--1">
         <img
            src="${pageContext.request.contextPath}/resources/images/ushma/gallery/gal-1.jpeg"
            alt="Gallery image 1"
            class="gallery__img"
            />
      </figure>
      <figure class="gallery__item gallery__item--2">
         <img
            src="${pageContext.request.contextPath}/resources/images/ushma/gallery/gal-2.jpeg"
            alt="Gallery image 2"
            class="gallery__img"
            />
      </figure>
      <figure class="gallery__item gallery__item--3">
         <img
            src="${pageContext.request.contextPath}/resources/images/ushma/gallery/gal-3.jpeg"
            alt="Gallery image 3"
            class="gallery__img"
            />
      </figure>
      <figure class="gallery__item gallery__item--4">
         <img
            src="${pageContext.request.contextPath}/resources/images/ushma/gallery/gal-4.jpeg"
            alt="Gallery image 4"
            class="gallery__img"
            />
      </figure>
      <figure class="gallery__item gallery__item--5">
         <img
            src="${pageContext.request.contextPath}/resources/images/ushma/gallery/gal-5.jpeg"
            alt="Gallery image 5"
            class="gallery__img"
            />
      </figure>
      <figure class="gallery__item gallery__item--6">
         <img
            src="${pageContext.request.contextPath}/resources/images/ushma/gallery/gal-6.jpeg"
            alt="Gallery image 6"
            class="gallery__img"
            />
      </figure>
      <figure class="gallery__item gallery__item--7">
         <img
            src="${pageContext.request.contextPath}/resources/images/ushma/gallery/gal-7.jpeg"
            alt="Gallery image 7"
            class="gallery__img"
            />
      </figure>
      <figure class="gallery__item gallery__item--8">
         <img
            src="${pageContext.request.contextPath}/resources/images/ushma/gallery/gal-8.jpeg"
            alt="Gallery image 8"
            class="gallery__img"
            />
      </figure>
      <figure class="gallery__item gallery__item--9">
         <img
            src="${pageContext.request.contextPath}/resources/images/ushma/gallery/gal-8.jpeg"
            alt="Gallery image 9"
            class="gallery__img"
            />
      </figure>
      <figure class="gallery__item gallery__item--10">
         <img
            src="${pageContext.request.contextPath}/resources/images/ushma/gallery/gal-10.jpeg"
            alt="Gallery image 10"
            class="gallery__img"
            />
      </figure>
      <figure class="gallery__item gallery__item--11">
         <img
            src="${pageContext.request.contextPath}/resources/images/ushma/gallery/gal-11.jpeg"
            alt="Gallery image 11"
            class="gallery__img"
            />
      </figure>
      <figure class="gallery__item gallery__item--12">
         <img
            src="${pageContext.request.contextPath}/resources/images/ushma/gallery/gal-12.jpeg"
            alt="Gallery image 12"
            class="gallery__img"
            />
      </figure>
      <figure class="gallery__item gallery__item--13">
         <img
            src="${pageContext.request.contextPath}/resources/images/ushma/gallery/gal-13.jpeg"
            alt="Gallery image 13"
            class="gallery__img"
            />
      </figure>
      <figure class="gallery__item gallery__item--14">
         <img
            src="${pageContext.request.contextPath}/resources/images/ushma/gallery/gal-14.jpeg"
            alt="Gallery image 14"
            class="gallery__img"
            />
      </figure>
   </section>
   <!-- Image Galary Ends -->
   <section class="section-cta">
      <div class="container">
         <div class="cta">
            <div class="cta-text-box">
               <h2 class="heading-secondary">Book Your First Stay with us:</h2>
               <p class="cta-text">
                  "Experience holistic wellness with our healthy, delicious, and
                  hassle-free meals tailored for your yoga retreat. Begin your
                  journey to well-being today with the flexibility to cancel or
                  pause anytime. Plus, enjoy your first meal on us as you immerse
                  in tranquility and rejuvenation."
               </p>
               <form class="cta-form" action="#">
                  <div>
                     <label for="full-name">Full Name</label>
                     <input
                        id="full-name"
                        type="text"
                        placeholder="John Smith"
                        required
                        />
                  </div>
                  <div>
                     <label for="email">Email address</label>
                     <input
                        id="email"
                        type="email"
                        placeholder="me@example.com"
                        required
                        />
                  </div>
                  <div>
                     <label for="select-where">Where did you hear from us?</label>
                     <select id="select-where" required>
                        <option value="">Please choose one option:</option>
                        <option value="friends">Friends and family</option>
                        <option value="youtube">YouTube video</option>
                        <option value="podcast">Podcast</option>
                        <option value="ad">Facebook ad</option>
                        <option value="others">Others</option>
                     </select>
                  </div>
                  <button class="btn btn--form">Sign up for Newsteller</button>
                  <!-- <input type="checkbox" />
                     <input type="number" /> -->
               </form>
            </div>
            <div
               class="cta-img-box"
               role="img"
               aria-label="Woman enjoying food"
               ></div>
         </div>
      </div>
   </section>

    <script src="https://cdn.jsdelivr.net/npm/flatpickr"></script>
       <script>
           flatpickr("#checkInOutDate", {
               mode: "range",
               dateFormat: "d-m-Y",
               minDate: "today"  // Ensures the user cannot select a past date
           });
       </script>


</main>