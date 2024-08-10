<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script>


 <main>
<div class="projects">
        <div class="project-card" style="padding:0;">
          <div>

   <form:form method="POST" modelAttribute="hotelForm" action="${pageContext.request.contextPath}/updateHotelEntity"  class="cta-form-login">
      <h2 class="form-signin-heading">Update Hotel</h2>
      <c:if test="${not empty successMessage}">
         <div id="serverError" class="successMessage">${successMessage}</div>
      </c:if>
      <br>
      <c:if test="${not empty serverError}">
         <div id="serverError" class="plErroMessage">${serverError}</div>
      </c:if>
      <spring:bind path="hotelId">
         <div class=" ${status.error ? 'has-error' : ''}">
            <form:input type="text" path="hotelId" readonly="true" value="${hotel_to_update.hotelId}" autocomplete="off"  oncopy="return false" onpaste="return false"   autofocus="true"></form:input>
            <form:errors path="hotelId"></form:errors>
         </div>
      </spring:bind>
      <spring:bind path="hotelName">
         <div class=" ${status.error ? 'has-error' : ''}">
            <form:input type="text" path="hotelName" class="form-control" value="${hotel_to_update.hotelName}"  autocomplete="off"  oncopy="return false" onpaste="return false" placeholder="Hotel Name"></form:input>
            <form:errors path="hotelName"></form:errors>
         </div>
      </spring:bind>

       <spring:bind path="hotelState">
               <div class=" ${status.error ? 'has-error' : ''}">
                  <form:input type="text" path="hotelState" class="form-control" value="${hotel_to_update.hotelState}"  autocomplete="off"  oncopy="return false" onpaste="return false" placeholder="Hotel State"></form:input>
                  <form:errors path="hotelState"></form:errors>
               </div>
            </spring:bind>

        <spring:bind path="hotelAddress">
                       <div class=" ${status.error ? 'has-error' : ''}">
                          <form:input type="text" path="hotelAddress" class="form-control" value="${hotel_to_update.hotelAddress}"  autocomplete="off"  oncopy="return false" onpaste="return false" placeholder="Hotel Address"></form:input>
                          <form:errors path="hotelAddress"></form:errors>
                       </div>
                    </spring:bind>

       <spring:bind path="hotelType">
            <div class="${status.error ? 'has-error' : ''}">
                <form:label path="hotelType" for="roles">Select Hotel Type</form:label>
                <form:select path="hotelType" autocomplete="off"  oncopy="return false" onpaste="return false" name="hotelType" id="hotelType"></form:select>
                <form:errors path="hotelType"></form:errors>
            </div>
        </spring:bind>




      <button class="btn btn--full margin-right-sm" type="submit">Save</button>
       <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
      <c:remove var="successMessage" scope="session" />
   </form:form>


      <c:if test="${not empty hotel_to_update.hotelType}">
       <input id="hotel_type_hidden" type="hidden" value="${hotel_to_update.hotelType.htypeId}"  />
         </c:if>


   </div>
</div>

 <br /><br />
    <div class="project-card-container">
      <div class="project-card">
        <div>
          <p>Update Hotel(s)</p>
          <p>
           A clear and up-to-date data of Firms helps in mapping the Properties with appropriate GST Numbers.
          </p>
        </div>
        <div class="project-card-icons">
        <a href="${pageContext.request.contextPath}/getFirms" class="link"><span class="material-symbols-outlined">View More &rarr; </span></a>
        </div>
      </div>
    </div>

</div>

<div class="announcements">
        <p class="section-title">Hotel Management</p>
        <div>
             <div>
             <p><a href="${pageContext.request.contextPath}/createHotel" style="text-decoration:none;color: #555;" >Create Hotel</a></p>
             </div>
             <div>
              <p><a href="${pageContext.request.contextPath}/getHotels" style="text-decoration:none;color: #555;" >View Hotels</a></p>
              </div>
              <div>
            <p><a href="${pageContext.request.contextPath}/createRooms" style="text-decoration:none;color: #555;" >Add Rooms</a></p>
            </div>
             <div>
            <p><a href="${pageContext.request.contextPath}/getRooms" style="text-decoration:none;color: #555;" >View Rooms</a></p>
            </div>
             <div>
            <p><a href="${pageContext.request.contextPath}/createStaff" style="text-decoration:none;color: #555;" >Add Staff</a></p>
            </div>
            <div>
            <p><a href="${pageContext.request.contextPath}/getStaff" style="text-decoration:none;color: #555;" >View Staff</a></p>
            </div>
            <div>
            <p><a href="${pageContext.request.contextPath}/createStaff" style="text-decoration:none;color: #555;" >Add Hotel Events</a></p>
            </div>
            <div>
            <p><a href="${pageContext.request.contextPath}/getStaff" style="text-decoration:none;color: #555;" >View Hotel Events</a></p>
            </div>
            <div>
            <p><a href="${pageContext.request.contextPath}/createStaff" style="text-decoration:none;color: #555;" >Add Blog Item</a></p>
            </div>
            <div>
            <p><a href="${pageContext.request.contextPath}/getStaff" style="text-decoration:none;color: #555;" >View Blog Items</a></p>
            </div>

        </div>
      </div>


</main>


<script type="text/javascript">

			$(document).ready(function() {
				getHotelTypes();
			});
</script>