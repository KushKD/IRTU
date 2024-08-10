<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script>


 <main>
<div class="projects">

        <br />




        <div class="project-card" style="padding:0;">
          <div>


   <form:form method="POST" modelAttribute="firmsForm" action="${pageContext.request.contextPath}/updateFirmEntity"  class="cta-form-login">
      <h2 class="form-signin-heading">Update Firm</h2>
      <c:if test="${not empty successMessage}">
         <div id="serverError" class="successMessage">${successMessage}</div>
      </c:if>
      <br>
      <c:if test="${not empty serverError}">
         <div id="serverError" class="plErroMessage">${serverError}</div>
      </c:if>
      <spring:bind path="firmId">
         <div class=" ${status.error ? 'has-error' : ''}">
            <form:input type="text" path="firmId" readonly="true" value="${firm_to_update.firmId}" autocomplete="off"  oncopy="return false" onpaste="return false"   autofocus="true"></form:input>
            <form:errors path="firmId"></form:errors>
         </div>
      </spring:bind>
      <spring:bind path="firmName">
         <div class=" ${status.error ? 'has-error' : ''}">
            <form:input type="text" path="firmName" class="form-control" value="${firm_to_update.firmName}"  autocomplete="off"  oncopy="return false" onpaste="return false" placeholder="Firm Name"></form:input>
            <form:errors path="firmName"></form:errors>
         </div>
      </spring:bind>

       <spring:bind path="firmDescription">
               <div class=" ${status.error ? 'has-error' : ''}">
                  <form:input type="text" path="firmDescription" class="form-control" value="${firm_to_update.firmDescription}"  autocomplete="off"  oncopy="return false" onpaste="return false" placeholder="Firm Description"></form:input>
                  <form:errors path="firmDescription"></form:errors>
               </div>
            </spring:bind>



      <spring:bind path="isActive">
         <div class=" ${status.error ? 'has-error' : ''}">
            <form:label path="isActive"> Is Active </form:label>
            <form:select path="isActive"  autocomplete="off"  oncopy="return false" onpaste="return false" id="earlierService">
               <form:option value=""> --Select-- </form:option>
               <form:option value="T"> Yes </form:option>
               <form:option value="F"> No </form:option>
            </form:select>
            <form:errors style="color:red;" path="isActive"></form:errors>
         </div>
      </spring:bind>
      <spring:bind path="isDeleted">
         <div class=" ${status.error ? 'has-error' : ''}">
            <form:label path="isDeleted"> Is Deleted </form:label>
            <form:select path="isDeleted"  autocomplete="off"  oncopy="return false" onpaste="return false" id="earlierService">
               <form:option value=""> --Select-- </form:option>
               <form:option value="T"> Yes </form:option>
               <form:option value="F"> No </form:option>
            </form:select>
            <form:errors style="color:red;" path="isDeleted"></form:errors>
         </div>
      </spring:bind>
      <button class="btn btn--full margin-right-sm" type="submit">Save</button>
       <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
      <c:remove var="successMessage" scope="session" />
   </form:form>
   </div>
</div>

 <br /><br />
                        <div class="project-card-container">
                          <div class="project-card">
                            <div>
                              <p>Update Firm(s)</p>
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
