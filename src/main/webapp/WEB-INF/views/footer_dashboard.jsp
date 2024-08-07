

      <footer>
          <p>Made with &#10084; by <a href="#">K.C.DHAWAN</a></p>
        </footer>
      </body>

      <script>
        document.addEventListener("DOMContentLoaded", function () {
          document
            .querySelector(".sidebar-toggle-button")
            .addEventListener("click", function () {
              console.log("Button clicked!"); // For debugging
              document.querySelector(".sidebar").classList.toggle("open");
            });
        });
      </script>

      <script>
        document.addEventListener("DOMContentLoaded", function () {
          var calendarEl = document.getElementById("calendar");

          var tooltip = document.createElement("div");
          tooltip.className = "tooltip";
          document.body.appendChild(tooltip);

          var calendar = new FullCalendar.Calendar(calendarEl, {
            initialView: "dayGridMonth",
            views: {
              dayGridMonth: {
                // Monthly view
                titleFormat: { year: "numeric", month: "long" },
              },
              timeGridWeek: {
                // Weekly view
                titleFormat: { year: "numeric", month: "short", day: "numeric" },
              },
            },
            headerToolbar: {
              // Toolbar configuration
              left: "prev,next today", // Navigation buttons
              center: "title", // Title of the current view
              right: "dayGridMonth,timeGridWeek", // Buttons for monthly and weekly views
            },
            events: [
              // Floor 1
              {
                title: "Floor 1 Room 1 - Deluxe",
                start: "2024-08-01",
                color: "#cf711f", // Updated color// Color for Room 1
                url: "/room-details?floor=1&room=1&category=Deluxe", // Custom URL for redirection
                description: "Description for Floor 1 Room 1 - Deluxe",
              },
              {
                title: "Floor 1 Room 2 - Premium",
                start: "2024-08-01",
                color: "grey", // Color for Room 2
                url: "/room-details?floor=1&room=1&category=Deluxe", // Custom URL for redirection
                description: "Description for Floor 1 Room 1 - Deluxe",
              },
              {
                title: "Floor 1 Room 3 - Deluxe",
                start: "2024-08-02",
                color: "pink", // Color for Room 3
                url: "/room-details?floor=1&room=1&category=Deluxe", // Custom URL for redirection
                description: "Description for Floor 1 Room 1 - Deluxe",
              },
              {
                title: "Floor 1 Room 4 - Premium",
                start: "2024-08-03",
                color: "yellow", // Color for Room 4
                url: "/room-details?floor=1&room=1&category=Deluxe", // Custom URL for redirection
                description: "Description for Floor 1 Room 1 - Deluxe",
              },

              // Floor 2
              {
                title: "Floor 2 Room 1 - Deluxe",
                start: "2024-08-01",
                color: "orange", // Color for Room 1
                url: "/room-details?floor=1&room=1&category=Deluxe", // Custom URL for redirection
                description: "Description for Floor 1 Room 1 - Deluxe",
              },
              {
                title: "Floor 2 Room 2 - Premium",
                start: "2024-08-05",
                color: "purple", // Color for Room 2
                url: "/room-details?floor=1&room=1&category=Deluxe", // Custom URL for redirection
                description: "Description for Floor 1 Room 1 - Deluxe",
              },
              {
                title: "Floor 2 Room 3 - Deluxe",
                start: "2024-08-07",
                color: "pink", // Color for Room 3
                url: "/room-details?floor=1&room=1&category=Deluxe", // Custom URL for redirection
                description: "Description for Floor 1 Room 1 - Deluxe",
              },
              {
                title: "Floor 2 Room 4 - Premium",
                start: "2024-08-09",
                color: "cyan", // Color for Room 4
                url: "/room-details?floor=1&room=1&category=Deluxe", // Custom URL for redirection
                description: "Description for Floor 1 Room 1 - Deluxe",
              },

              // Floor 3
              {
                title: "Floor 3 Room 1 - Deluxe",
                start: "2024-08-10",
                color: "brown", // Color for Room 1
                url: "/room-details?floor=1&room=1&category=Deluxe", // Custom URL for redirection
                description: "Description for Floor 1 Room 1 - Deluxe",
              },
              {
                title: "Floor 3 Room 2 - Premium",
                start: "2024-08-11",
                color: "magenta", // Color for Room 2
                url: "/room-details?floor=1&room=1&category=Deluxe", // Custom URL for redirection
                description: "Description for Floor 1 Room 1 - Deluxe",
              },
              {
                title: "Floor 3 Room 3 - Deluxe",
                start: "2024-09-12",
                color: "lime", // Color for Room 3
                url: "/room-details?floor=1&room=1&category=Deluxe", // Custom URL for redirection
                description: "Description for Floor 1 Room 1 - Deluxe",
              },
              {
                title: "Floor 3 Room 4 - Premium",
                start: "2024-10-13",
                color: "navy", // Color for Room 4
                url: "/room-details?floor=1&room=1&category=Deluxe", // Custom URL for redirection
                description: "Description for Floor 1 Room 1 - Deluxe",
              },
            ],
            eventMouseEnter: function (info) {
              tooltip.innerHTML =
                "<strong>" +
                info.event.title +
                "</strong><br>" +
                info.event.extendedProps.description;
              tooltip.style.opacity = 1;
            },
            eventMouseLeave: function (info) {
              tooltip.style.opacity = 0;
            },
            eventMouseMove: function (info, event) {
              var calendarContainer = calendarEl.getBoundingClientRect();

              // Position the tooltip relative to the calendar container
              tooltip.style.left = event.clientX - calendarContainer.left + "px";
              tooltip.style.top =
                event.clientY -
                calendarContainer.top -
                tooltip.offsetHeight -
                10 +
                "px";
            },
            eventClick: function (info) {
              // Prevent the default browser action for clicking
              info.jsEvent.preventDefault();

              // Route to the event's URL (you could use your own routing logic here)
              if (info.event.url) {
                window.location.href = info.event.url;
              }
            },
          });

          calendar.render();
        });
      </script>
      <script src="https://cdn.jsdelivr.net/npm/fullcalendar@5.9.0/main.min.js"></script>




   <!-- <script src="${pageContext.request.contextPath}/resources/js/vendor/jquery.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/js/vendor/popper.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/vendor/datatables.min.js"></script>  -->

    <!-- <script src="${pageContext.request.contextPath}/resources/js/vendor/bootstrap.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/js/vendor/metisMenu.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/js/vendor/jquery.slimscroll.min.js" type="text/javascript"></script>  -->

    <!-- PAGE LEVEL PLUGINS-->
   <!-- <script src="${pageContext.request.contextPath}/resources/js/vendor/Chart.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/js/vendor/jquery-jvectormap-2.0.3.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/js/vendor/jquery-jvectormap-world-mill-en.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/js/vendor/jquery-jvectormap-us-aea-en.js" type="text/javascript"></script>  -->

    <!-- CORE SCRIPTS-->
   <!-- <script src="${pageContext.request.contextPath}/resources/js/vendor/app.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script>
     <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/common.js"></script>  -->


 <!-- <script language="javascript" src="https://momentjs.com/downloads/moment.js"></script>
    <script language="javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.43/js/bootstrap-datetimepicker.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.43/css/bootstrap-datetimepicker.min.css">  -->


        <!-- <script type="text/javascript">

  function disableBack() {window.history.forward()}

    window.onload = disableBack();
    window.onpageshow = function (evt) {if (evt.persisted) disableBack()}

        </script>  -->
</html>