<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script>


 <main>
<div class="projects">
        <div class="project-card" style="padding:0;">
          <div>

   <form:form method="POST" modelAttribute="roomamenitiesForm" action="${pageContext.request.contextPath}/updateRoomAEntity"  class="cta-form-login">
      <h2 class="form-signin-heading">Update Room Amenity</h2>
      <c:if test="${not empty successMessage}">
         <div id="serverError" class="successMessage">${successMessage}</div>
      </c:if>
      <br>
      <c:if test="${not empty serverError}">
         <div id="serverError" class="plErroMessage">${serverError}</div>
      </c:if>


      <spring:bind path="roomAmenityId">
         <div class=" ${status.error ? 'has-error' : ''}">
            <form:input type="text" path="roomAmenityId" readonly="true" value="${rooma_to_update.roomAmenityId}" autocomplete="off"  oncopy="return false" onpaste="return false"   autofocus="true"></form:input>
            <form:errors path="roomAmenityId"></form:errors>
         </div>
      </spring:bind>



 <spring:bind path="hotelId">
         <div class=" ${status.error ? 'has-error' : ''}">
            <form:label path="hotelId"> Hotel Name </form:label>
            <form:select path="hotelId" name="hotelId" id="hotelId"  onchange="getRoomsViaHotel(this.value);"></form:select>
            <form:errors style="color:red;" path="hotelId"></form:errors>
         </div>
      </spring:bind>

                        <spring:bind path="roomId">
                           <div class=" ${status.error ? 'has-error' : ''}">
                              <form:label path="roomId"> Room Type </form:label>
                              <form:select path="roomId" name="roomId" id="roomTypeId"></form:select>
                              <form:errors style="color:red;" path="roomId"></form:errors>
                           </div>
                        </spring:bind>

                        <spring:bind path="amenityName">
                            <div class="${status.error ? 'has-error' : ''}">
                                <form:input type="text" path="amenityName" value="${rooma_to_update.amenityName}" autocomplete="off" onfocus="this.removeAttribute('readonly');" onkeypress="return alpha(event) "  oncopy="return false" onpaste="return false"  placeholder="Amenity Name"
                                            autofocus="true"></form:input>
                                <form:errors  path="amenityName"></form:errors>
                            </div>
                        </spring:bind>

                         <spring:bind path="amenityDescription">
                            <div   ${status.error ? 'has-error' : ''}">
                                <form:input type="text" autocomplete="off" value="${rooma_to_update.amenityDescription}" onfocus="this.removeAttribute('readonly');" path="amenityDescription" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="roomNo" placeholder="Amenity Description" ></form:input>
                                <form:errors  path="amenityDescription"></form:errors>
                            </div>
                        </spring:bind>

      <button class="btn btn--full margin-right-sm" type="submit">Update</button>
       <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
      <c:remove var="successMessage" scope="session" />
   </form:form>

    <c:if test="${not empty rooma_to_update.hotel}">
      <input id="hotel_id_hidden" type="hidden" value="${rooma_to_update.hotel.hotelId}"  />
      <input id="room_id_hidden" type="hidden" value="${rooma_to_update.room.roomId}"  />
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
        <p class="section-title">Room(s) Management</p>
        <div>
              <div>
            <p><a href="${pageContext.request.contextPath}/createRooms" style="text-decoration:none;color: #555;" >Add Rooms</a></p>
            </div>
             <div>
            <p><a href="${pageContext.request.contextPath}/getRooms" style="text-decoration:none;color: #555;" >View Rooms</a></p>
            </div>
             <div>
            <p><a href="${pageContext.request.contextPath}/createRoomAmenities" style="text-decoration:none;color: #555;" >Add Room Amenities</a></p>
            </div>
             <div>
            <p><a href="${pageContext.request.contextPath}/getRoomAmenities" style="text-decoration:none;color: #555;" > View Room Amenities</a></p>
            </div>
             <div>
            <p><a href="${pageContext.request.contextPath}/getRoomTypes" style="text-decoration:none;color: #555;" > View Room Types</a></p>
            </div>

        </div>
      </div>
</main>


<script type="text/javascript">

function getHotelTypes_(){
        if(document.getElementById('hotel_id_hidden') != null && document.getElementById('hotel_id_hidden').value  != null ){
                  getHotels();
                  }
            }



  function getRooms_(){
                    if(document.getElementById('hotel_id_hidden') != null && document.getElementById('hotel_id_hidden').value  != null ){
                              getRoomsViaHotel(document.getElementById('hotel_id_hidden').value);
                              }
                        }

			$(document).ready(function() {
				getHotelTypes_();
				getRooms_();
			});
</script>