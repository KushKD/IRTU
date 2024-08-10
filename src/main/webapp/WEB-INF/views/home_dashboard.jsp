<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>
	<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


 <link
      href="https://cdn.jsdelivr.net/npm/fullcalendar@5.9.0/main.min.css"
      rel="stylesheet"
    />

 <main>
      <div class="projects">
        <p class="section-title">Bookings Calender</p>
        <br />
        <div class="project-card">
          <div>
            <div id="calendar"></div>
          </div>
        </div>
        <br /><br />
        <p class="section-title">Your Projects</p>
        <div class="project-card-container">
          <div class="project-card">
            <div>
              <p>Less Cool Project</p>
              <p>
                Nullam condimentum ipsum ut lectus vehicula consectetur.
                Quiseque sed dolor tincidunt, consectetur sapien et, facilsis
                dolor. Duis sem purus, dignissim ut sapien in, varius
                pellentesque lacus.
              </p>
            </div>
            <div class="project-card-icons">
              <span class="material-symbols-rounded"> bookmark </span>
              <span class="material-symbols-rounded"> delete </span>
              <span class="material-symbols-rounded"> share </span>
            </div>
          </div>
          <div class="project-card">
            <div>
              <p>Impossible App</p>
              <p>
                In hac habitasse platea dictumst. Vivamus dictum rutrum arcu, a
                placerat velit sagittis id.
              </p>
            </div>
            <div class="project-card-icons">
              <span class="material-symbols-rounded"> bookmark </span>
              <span class="material-symbols-rounded"> delete </span>
              <span class="material-symbols-rounded"> share </span>
            </div>
          </div>
          <div class="project-card">
            <div>
              <p>Easy Peasy App</p>
              <p>
                Etiam cursus eros ac efficiur fringilla. Vestibulum dignissim
                urna eget accumsan aliquam. Curabitur dignissim nisi in tortor
                commondo, ac bibendum magna tincidunt.
              </p>
            </div>
            <div class="project-card-icons">
              <span class="material-symbols-rounded"> bookmark </span>
              <span class="material-symbols-rounded"> delete </span>
              <span class="material-symbols-rounded"> share </span>
            </div>
          </div>
          <div class="project-card">
            <div>
              <p>Ad Blocker</p>
              <p>
                Quisque eget rutrum nisl. Nam augue justo, cursus vitae metus
                vel, pharetra hendrerit felis. Aliquam sed malesuada eros.
              </p>
            </div>
            <div class="project-card-icons">
              <span class="material-symbols-rounded"> bookmark </span>
              <span class="material-symbols-rounded"> delete </span>
              <span class="material-symbols-rounded"> share </span>
            </div>
          </div>
          <div class="project-card">
            <div>
              <p>Money Maker</p>
              <p>
                Prasent convallis, libero quis congue elementum, nunc ante
                faucibus sapien, ac scelerisque tortor purus sit amet ex.
                Pellentesque mollis nec sem vel aliquam.
              </p>
            </div>
            <div class="project-card-icons">
              <span class="material-symbols-rounded"> bookmark </span>
              <span class="material-symbols-rounded"> delete </span>
              <span class="material-symbols-rounded"> share </span>
            </div>
          </div>
        </div>
      </div>
      <div class="announcements">
        <p class="section-title">Hotel Management</p>
        <div>
          <div>
           <p><a href="${pageContext.request.contextPath}/createRole" style="text-decoration:none;color: #555;" >Role Management</a></p>
          </div>
          <div>
            <p><a href="${pageContext.request.contextPath}/getRoles" style="text-decoration:none;color: #555;" >Company Management</a></p>
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
      <div class="trending">
        <p class="section-title">Trending</p>
        <div>
          <div>
            <img
              class="profile-picture"
              src="images/pics/profile-pic2.png"
              alt="profile picture 1"
            />
            <div>
              <p>@Foody</p>
              <p>Food and Cuisines</p>
            </div>
          </div>
          <div>
            <img
              class="profile-picture"
              src="images/dashboards/food.jpg"
              alt="profile picture 2"
            />
            <div>
              <p>@Yogic</p>
              <p>Yoga and Wellness</p>
            </div>
          </div>
          <div>
            <img
              class="profile-picture"
              src="images/pics/profile-pic4.png"
              alt="profile picture 3"
            />
            <div>
              <p>@Blogging</p>
              <p>Blog</p>
            </div>
          </div>
          <div>
            <img
              class="profile-picture"
              src="images/pics/profile-pic5.png"
              alt="profile picture 4"
            />
            <div>
              <p>@alex</p>
              <p>No Traffic Maker</p>
            </div>
          </div>
        </div>
      </div>
    </main>

    <script src="https://cdn.jsdelivr.net/npm/fullcalendar@5.9.0/main.min.js"></script>
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
