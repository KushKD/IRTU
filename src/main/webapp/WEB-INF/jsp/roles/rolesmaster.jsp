<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <script src="${pageContext.request.contextPath}/resources/js/jquery-3.5.1.min.js"></script>

 <!--
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/flight_application_form.js"></script>
 -->



 <main>
<div class="projects">
        <p class="section-title">Create Role</p>
        <br />
        <div class="project-card" style="padding:0;">
          <div>
            <form:form method="POST" modelAttribute="rolesForm" action="${pageContext.request.contextPath}/saveRole" class="cta-form-login">

                         <c:if test="${not empty successMessage}">
                                <div id="serverError" class="successMessage">${successMessage}</div>
                            </c:if>
                             <br>
                            <c:if test="${not empty serverError}">
                                <div id="serverError" class="plErroMessage">${serverError}</div>
                            </c:if>
                        <spring:bind path="roleName">
                            <div class="${status.error ? 'has-error' : ''}">
                                <form:input type="text" path="roleName" autocomplete="off" onfocus="this.removeAttribute('readonly');" onkeypress="return alpha(event) "  oncopy="return false" onpaste="return false"  placeholder="Role Name"
                                            autofocus="true"></form:input>
                                <form:errors  path="roleName"></form:errors>
                            </div>
                        </spring:bind>

                         <spring:bind path="roleDescription">
                                        <div   ${status.error ? 'has-error' : ''}">
                                            <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="roleDescription" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="roleDescription" placeholder="Role Description" ></form:input>
                                            <form:errors  path="roleDescription"></form:errors>
                                        </div>
                                    </spring:bind>


                        <button class="btn btn--full margin-right-sm" type="submit">Submit</button>
                        <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
                        <c:remove var="successMessage" scope="session" />
                    </form:form>
          </div>
        </div>
        <br /><br />
        <p class="section-title">Hotel Roles</p>
                <div class="project-card-container">
                  <div class="project-card">
                    <div>
                      <p>Hotel Role(s)</p>
                      <p>
                       Hotel role(s) refer to the various positions and job titles within a hotel, each responsible for specific functions that contribute to the overall operation and guest experience.
                      </p>
                    </div>
                    <div class="project-card-icons">
                    <a href="${pageContext.request.contextPath}/getRoles" class="link"><span class="material-symbols-outlined">View More &rarr; </span></a>
                    </div>
                  </div>
                </div>

</div>



<div class="announcements">
        <p class="section-title">Hotel Management</p>
        <div>
          <div>
            <p>Hotels</p>
          </div>
          <div>
            <p>Hotel Staff</p>
          </div>
          <div>
            <p>Hotel Rooms</p>
          </div>
          <div>
            <p>Transport Facility</p>
          </div>
          <div>
            <p>Customers</p>
          </div>
          <div>
            <p>Bookings</p>
          </div>
          <div>
            <p>News and Events</p>
          </div>
          <div>
            <p>Shop</p>
          </div>
          <div>
            <p>Memberships</p>
          </div>
          <div>
            <p>Store</p>
          </div>
        </div>
      </div>



    </main>

