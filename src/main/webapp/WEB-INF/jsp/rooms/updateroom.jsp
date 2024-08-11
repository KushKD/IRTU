<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script>


 <main>
<div class="projects">
        <div class="project-card" style="padding:0;">
          <div>

   <form:form method="POST" modelAttribute="roomForm" action="${pageContext.request.contextPath}/updateRoomEntity"  class="cta-form-login">
      <h2 class="form-signin-heading">Update Room</h2>
      <c:if test="${not empty successMessage}">
         <div id="serverError" class="successMessage">${successMessage}</div>
      </c:if>
      <br>
      <c:if test="${not empty serverError}">
         <div id="serverError" class="plErroMessage">${serverError}</div>
      </c:if>


      <spring:bind path="roomId">
         <div class=" ${status.error ? 'has-error' : ''}">
            <form:input type="text" path="roomId" readonly="true" value="${room_to_update.roomId}" autocomplete="off"  oncopy="return false" onpaste="return false"   autofocus="true"></form:input>
            <form:errors path="roomId"></form:errors>
         </div>
      </spring:bind>




      <spring:bind path="hotelId">
              <div class=" ${status.error ? 'has-error' : ''}">
                 <form:label path="hotelId"> Hotel Name </form:label>
                 <form:select path="hotelId" name="hotelId" id="hotelId"  onchange="getFloors(this.value);"></form:select>
                 <form:errors style="color:red;" path="hotelId"></form:errors>
              </div>
           </spring:bind>

       <spring:bind path="floorId">
        <div class=" ${status.error ? 'has-error' : ''}">
           <form:label path="floorId"> Room Floor </form:label>
           <form:select path="floorId" name="floorId" id="floorId" onchange="getRoomTypes(this.value);"></form:select>
           <form:errors style="color:red;" path="floorId"></form:errors>
        </div>
     </spring:bind>

     <spring:bind path="roomTypeId">
        <div class=" ${status.error ? 'has-error' : ''}">
           <form:label path="roomTypeId"> Room Type </form:label>
           <form:select path="roomTypeId" name="roomTypeId" id="roomTypeId"></form:select>
           <form:errors style="color:red;" path="roomTypeId"></form:errors>
        </div>
     </spring:bind>


     <spring:bind path="roomName">
         <div class="${status.error ? 'has-error' : ''}">
             <form:input type="text" path="roomName" autocomplete="off" value="${room_to_update.roomName}" onfocus="this.removeAttribute('readonly');" onkeypress="return alpha(event) "  oncopy="return false" onpaste="return false"  placeholder="Room Name"
                         autofocus="true"></form:input>
             <form:errors  path="roomName"></form:errors>
         </div>
     </spring:bind>

      <spring:bind path="roomNo">
         <div   ${status.error ? 'has-error' : ''}">
             <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" value="${room_to_update.roomNo}" path="roomNo" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="roomNo" placeholder="Room Number" ></form:input>
             <form:errors  path="roomNo"></form:errors>
         </div>
     </spring:bind>

     <spring:bind path="roomDesc">
         <div   ${status.error ? 'has-error' : ''}">
             <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="roomDesc" value="${room_to_update.roomDesc}" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="roomDesc" placeholder="Description" ></form:input>
             <form:errors  path="roomDesc"></form:errors>
         </div>
     </spring:bind>

     <spring:bind path="roomPrice">
         <div   ${status.error ? 'has-error' : ''}">
             <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="roomPrice" value="${room_to_update.roomPrice}" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="roomPrice" placeholder="Room Price" ></form:input>
             <form:errors  path="roomPrice"></form:errors>
         </div>
     </spring:bind>

      <spring:bind path="roomTax">
             <div   ${status.error ? 'has-error' : ''}">
                 <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="roomTax" value="${room_to_update.roomTax}" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="roomTax" placeholder="Room Tax" ></form:input>
                 <form:errors  path="roomTax"></form:errors>
             </div>
         </spring:bind>

      <spring:bind path="roomSize">
          <div   ${status.error ? 'has-error' : ''}">
              <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="roomSize" value="${room_to_update.roomSize}" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="roomSize" placeholder="Room Size" ></form:input>
              <form:errors  path="roomSize"></form:errors>
          </div>
      </spring:bind>

       <spring:bind path="roomCapacity">
           <div   ${status.error ? 'has-error' : ''}">
               <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="roomCapacity" value="${room_to_update.roomCapacity}" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="roomCapacity" placeholder="Room Capacity (Beds)" ></form:input>
               <form:errors  path="roomCapacity"></form:errors>
           </div>
       </spring:bind>

      <button class="btn btn--full margin-right-sm" type="submit">Update</button>
       <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
      <c:remove var="successMessage" scope="session" />
   </form:form>

    <c:if test="${not empty room_to_update.hotelEntity}">
      <input id="hotel_id_hidden" type="hidden" value="${room_to_update.hotelEntity.hotelId}"  />
      <input id="floor_id_hidden" type="hidden" value="${room_to_update.floorTypeEntity.floorId}"  />
      <input id="roomtype_id_hidden" type="hidden" value="${room_to_update.rtypeEntity.rtypeId}"  />
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

            function getFloors_(){
                    if(document.getElementById('floor_id_hidden') != null && document.getElementById('floor_id_hidden').value  != null ){
                              getFloors(document.getElementById('hotel_id_hidden').value);
                              }
                        }

                          function getRoomType_(){
                                            if(document.getElementById('roomtype_id_hidden') != null && document.getElementById('roomtype_id_hidden').value  != null ){
                                                      getRoomTypes(document.getElementById('floor_id_hidden').value);
                                                      }
                                                }

			$(document).ready(function() {
				getHotelTypes_();
				getFloors_();
				getRoomType_();
			});
</script>