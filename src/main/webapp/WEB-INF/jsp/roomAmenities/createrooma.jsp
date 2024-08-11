<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <script src="${pageContext.request.contextPath}/resources/js/jquery-3.5.1.min.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script>



 <main>
<div class="projects">
        <p class="section-title">Create Room Amenities</p>
        <br />
        <div class="project-card" style="padding:0;">
          <div>
            <form:form method="POST" modelAttribute="roomamenitiesForm" action="${pageContext.request.contextPath}/saveRooma" class="cta-form-login">

                         <c:if test="${not empty successMessage}">
                                <div id="serverError" class="successMessage">${successMessage}</div>
                            </c:if>
                             <br>
                            <c:if test="${not empty serverError}">
                                <div id="serverError" class="plErroMessage">${serverError}</div>
                            </c:if>

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
                                <form:input type="text" path="amenityName" autocomplete="off" onfocus="this.removeAttribute('readonly');" onkeypress="return alpha(event) "  oncopy="return false" onpaste="return false"  placeholder="Amenity Name"
                                            autofocus="true"></form:input>
                                <form:errors  path="amenityName"></form:errors>
                            </div>
                        </spring:bind>

                         <spring:bind path="amenityDescription">
                            <div   ${status.error ? 'has-error' : ''}">
                                <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="amenityDescription" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="roomNo" placeholder="Amenity Description" ></form:input>
                                <form:errors  path="amenityDescription"></form:errors>
                            </div>
                        </spring:bind>


                        <button class="btn btn--full margin-right-sm" type="submit">Submit</button>
                        <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
                        <c:remove var="successMessage" scope="session" />
                    </form:form>
          </div>
        </div>
        <br /><br />

                <div class="project-card-container">
                  <div class="project-card">
                    <div>
                      <p>Hotel(s)</p>
                      <p>
                     Properties
                      </p>
                    </div>
                    <div class="project-card-icons">
                    <a href="${pageContext.request.contextPath}/getHotels" class="link"><span class="material-symbols-outlined">View More &rarr; </span></a>
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

			$(document).ready(function() {
				getHotels();
			});
</script>