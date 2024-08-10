<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <script src="${pageContext.request.contextPath}/resources/js/jquery-3.5.1.min.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script>



 <main>
<div class="projects">
        <p class="section-title">Create Hotel</p>
        <br />
        <div class="project-card" style="padding:0;">
          <div>
            <form:form method="POST" modelAttribute="hotelForm" action="${pageContext.request.contextPath}/saveHotel" class="cta-form-login">

                         <c:if test="${not empty successMessage}">
                                <div id="serverError" class="successMessage">${successMessage}</div>
                            </c:if>
                             <br>
                            <c:if test="${not empty serverError}">
                                <div id="serverError" class="plErroMessage">${serverError}</div>
                            </c:if>
                        <spring:bind path="hotelName">
                            <div class="${status.error ? 'has-error' : ''}">
                                <form:input type="text" path="hotelName" autocomplete="off" onfocus="this.removeAttribute('readonly');" onkeypress="return alpha(event) "  oncopy="return false" onpaste="return false"  placeholder="Hotel Name"
                                            autofocus="true"></form:input>
                                <form:errors  path="hotelName"></form:errors>
                            </div>
                        </spring:bind>

                         <spring:bind path="hotelState">
                            <div   ${status.error ? 'has-error' : ''}">
                                <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="hotelState" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="hotelState" placeholder="State" ></form:input>
                                <form:errors  path="hotelState"></form:errors>
                            </div>
                        </spring:bind>

                        <spring:bind path="hotelAddress">
                            <div   ${status.error ? 'has-error' : ''}">
                                <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="hotelAddress" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="hotelAddress" placeholder="Address" ></form:input>
                                <form:errors  path="hotelAddress"></form:errors>
                            </div>
                        </spring:bind>

                        <spring:bind path="hotelType">
                                 <div class=" ${status.error ? 'has-error' : ''}">
                                    <form:label path="hotelType"> Hotel Type </form:label>
                                    <form:select path="hotelType" name="hotelType" id="hotelType"></form:select>
                                    <form:errors style="color:red;" path="hotelType"></form:errors>
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