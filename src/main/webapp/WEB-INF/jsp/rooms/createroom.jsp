<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <script src="${pageContext.request.contextPath}/resources/js/jquery-3.5.1.min.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script>



 <main>
<div class="projects">
        <p class="section-title">Create Room</p>
        <br />
        <div class="project-card" style="padding:0;">
          <div>
            <form:form method="POST" modelAttribute="roomForm" action="${pageContext.request.contextPath}/saveRoom" class="cta-form-login">

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
                                <form:input type="text" path="roomName" autocomplete="off" onfocus="this.removeAttribute('readonly');" onkeypress="return alpha(event) "  oncopy="return false" onpaste="return false"  placeholder="Room Name"
                                            autofocus="true"></form:input>
                                <form:errors  path="roomName"></form:errors>
                            </div>
                        </spring:bind>

                         <spring:bind path="roomNo">
                            <div   ${status.error ? 'has-error' : ''}">
                                <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="roomNo" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="roomNo" placeholder="Room Number" ></form:input>
                                <form:errors  path="roomNo"></form:errors>
                            </div>
                        </spring:bind>

                        <spring:bind path="roomDesc">
                            <div   ${status.error ? 'has-error' : ''}">
                                <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="roomDesc" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="roomDesc" placeholder="Description" ></form:input>
                                <form:errors  path="roomDesc"></form:errors>
                            </div>
                        </spring:bind>

                        <spring:bind path="roomPrice">
                            <div   ${status.error ? 'has-error' : ''}">
                                <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="roomPrice" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="roomPrice" placeholder="Room Price" ></form:input>
                                <form:errors  path="roomPrice"></form:errors>
                            </div>
                        </spring:bind>

                         <spring:bind path="roomTax">
                                <div   ${status.error ? 'has-error' : ''}">
                                    <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="roomTax" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="roomTax" placeholder="Room Tax" ></form:input>
                                    <form:errors  path="roomTax"></form:errors>
                                </div>
                            </spring:bind>

                         <spring:bind path="roomSize">
                             <div   ${status.error ? 'has-error' : ''}">
                                 <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="roomSize" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="roomSize" placeholder="Room Size" ></form:input>
                                 <form:errors  path="roomSize"></form:errors>
                             </div>
                         </spring:bind>

                          <spring:bind path="roomCapacity">
                              <div   ${status.error ? 'has-error' : ''}">
                                  <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="roomCapacity" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="roomCapacity" placeholder="Room Capacity (Beds)" ></form:input>
                                  <form:errors  path="roomCapacity"></form:errors>
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
            <p><a href="${pageContext.request.contextPath}/createStaff" style="text-decoration:none;color: #555;" >View Room Amenities</a></p>
            </div>
             <div>
            <p><a href="${pageContext.request.contextPath}/createStaff" style="text-decoration:none;color: #555;" > Add Room Images</a></p>
            </div>
             <div>
            <p><a href="${pageContext.request.contextPath}/createStaff" style="text-decoration:none;color: #555;" > View Room Types</a></p>
            </div>

        </div>
      </div>



    </main>

<script type="text/javascript">

			$(document).ready(function() {
				getHotels();
			});
</script>