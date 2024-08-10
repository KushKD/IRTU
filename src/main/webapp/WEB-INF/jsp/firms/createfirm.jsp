<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <script src="${pageContext.request.contextPath}/resources/js/jquery-3.5.1.min.js"></script>

 <!--
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/flight_application_form.js"></script>
 -->



 <main>
<div class="projects">
        <p class="section-title">Create Firm</p>
        <br />
        <div class="project-card" style="padding:0;">
          <div>
            <form:form method="POST" modelAttribute="firmsForm" action="${pageContext.request.contextPath}/saveFirm" class="cta-form-login">

                         <c:if test="${not empty successMessage}">
                                <div id="serverError" class="successMessage">${successMessage}</div>
                            </c:if>
                             <br>
                            <c:if test="${not empty serverError}">
                                <div id="serverError" class="plErroMessage">${serverError}</div>
                            </c:if>
                        <spring:bind path="firmName">
                            <div class="${status.error ? 'has-error' : ''}">
                                <form:input type="text" path="firmName" autocomplete="off" onfocus="this.removeAttribute('readonly');" onkeypress="return alpha(event) "  oncopy="return false" onpaste="return false"  placeholder="Firm Name"
                                            autofocus="true"></form:input>
                                <form:errors  path="firmName"></form:errors>
                            </div>
                        </spring:bind>

                         <spring:bind path="firmDescription">
                                        <div   ${status.error ? 'has-error' : ''}">
                                            <form:input type="text" autocomplete="off" onfocus="this.removeAttribute('readonly');" path="firmDescription" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"     name="firmDescription" placeholder="Firm Description" ></form:input>
                                            <form:errors  path="firmDescription"></form:errors>
                                        </div>
                                    </spring:bind>


                        <button class="btn btn--full margin-right-sm" type="submit">Submit</button>
                        <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
                        <c:remove var="successMessage" scope="session" />
                    </form:form>
          </div>
        </div>
        <br /><br />
        <p class="section-title">Firms</p>
                <div class="project-card-container">
                  <div class="project-card">
                    <div>
                      <p>Firms</p>
                      <p>
                      In economic and business contexts, a firm refers to an organization or entity that engages in commercial activities, typically with the goal of earning profits.
                      </p>
                    </div>
                    <div class="project-card-icons">
                    <a href="${pageContext.request.contextPath}/getFirms" class="link"><span class="material-symbols-outlined">View More &rarr; </span></a>
                    </div>
                  </div>
                </div>

</div>



<div class="announcements">
        <p class="section-title">Firm Management</p>
        <div>
             <div>
             <p><a href="${pageContext.request.contextPath}/createFirm" style="text-decoration:none;color: #555;" >Create Firm</a></p>
             </div>
             <div>
              <p><a href="${pageContext.request.contextPath}/getFirms" style="text-decoration:none;color: #555;" >View Firms</a></p>
              </div>
              <div>
            <p><a href="${pageContext.request.contextPath}/getFirmDocs" style="text-decoration:none;color: #555;" >Add Firm Documents</a></p>
            </div>
             <div>
                        <p><a href="${pageContext.request.contextPath}/viewFirmDocs" style="text-decoration:none;color: #555;" >View Firm Documents</a></p>
                        </div>

        </div>
      </div>



    </main>

