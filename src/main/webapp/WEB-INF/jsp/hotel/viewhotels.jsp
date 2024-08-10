<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>
 <script src="${pageContext.request.contextPath}/resources/js/bootstrapd.min.js"></script>
<!-- <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script> -->
<script src="${pageContext.request.contextPath}/resources/js/plugins/pace.min.js"></script>
<!-- <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/plugins/bootstrap-datepicker.min.js"></script> -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/plugins/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/plugins/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.spring-friendly.js"></script>

<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

<style>

   /* Alternate row colors */
   #sampleTable tbody tr:nth-child(odd) {
       background-color: #f2f2f2;
   }
   #sampleTable tbody tr:nth-child(even) {
       background-color: #e6e6e6;
   }
   /* Border lines between rows */
   #sampleTable tbody tr {
       border-bottom: 1px solid #ddd;
   }
   /* Header styles */
   #sampleTable thead tr {
       background-color: #cf711f;
   }
   #sampleTable thead th {
       color: #FFF;
       font-weight: bold;
       padding: 1rem;
       text-align: center;
   }
   /* Central alignment for all cells */
   #sampleTable tbody td {
       text-align: center;
        padding: 1rem;
   }

   /* Style for pagination */
   .dataTables_wrapper .dataTables_paginate {
       display: flex;
       justify-content: center;
       align-items: center;
       margin-top: 20px;
   }

   .dataTables_wrapper .dataTables_paginate .paginate_button {
       border-radius: 50%;
       background-color: #cf711f;
       color: #FFF !important;
       border: none;
       margin: 0 3px; /* Reduced margin */
       padding: 5px; /* Reduced padding */
       width: 30px; /* Reduced width */
       height: 30px; /* Reduced height */
       display: inline-flex;
       align-items: center;
       justify-content: center;
       text-align: center;
       cursor: pointer; /* Pointer cursor */
       font-size: 14px; /* Smaller font size */
   }

   .dataTables_wrapper .dataTables_paginate .paginate_button:hover {
       background-color: #a85a1b;
   }

   .dataTables_wrapper .dataTables_paginate .paginate_button.current {
       background-color: #a85a1b !important;
   }

   /* Pagination numbers styling */
   .dataTables_wrapper .dataTables_paginate .paginate_button span {
       color: #FFF; /* White color for numbers */
       text-decoration: none; /* Remove underline */
   }

   /* Pagination numbers styling */
      .dataTables_wrapper .dataTables_paginate .paginate_button a {
          color: #FFF; /* White color for numbers */
          text-decoration: none; /* Remove underline */
      }

   /* Pagination arrow styling */
   .dataTables_wrapper .dataTables_paginate .paginate_button.previous,
   .dataTables_wrapper .dataTables_paginate .paginate_button.next {
       background-color: #cf711f;
       color: #FFF; /* White color for arrows */
   }

   .dataTables_wrapper .dataTables_paginate .paginate_button.previous:hover,
   .dataTables_wrapper .dataTables_paginate .paginate_button.next:hover {
       background-color: #a85a1b;

   }

   /* Align search and show entries */
   .dataTables_wrapper .dataTables_length,
   .dataTables_wrapper .dataTables_filter {
       display: flex;
       align-items: center;
   }

   .dataTables_wrapper .dataTables_filter {
       justify-content: flex-end;
   }

   .dataTables_wrapper .dataTables_length {
       justify-content: flex-start;
   }

   /* Center both items together */
   .dataTables_wrapper .dt-top {
       display: flex;
       justify-content: space-between;
       margin-bottom: 20px;
   }

 /* Ensure responsive display on smaller screens */
   @media (max-width: 768px) {
       .dataTables_wrapper .dt-top {
           flex-direction: column;
           align-items: center;
       }

       .dataTables_wrapper .dataTables_length,
       .dataTables_wrapper .dataTables_filter {
           justify-content: center;
           margin-bottom: 10px;
       }

       /* Horizontal scrolling for small screens */
       .dataTables_wrapper .dataTables_scroll {
           overflow-x: auto;
       }
   }

   /* Icon styles for pagination */
   .material-icons {
       font-size: 18px;
       line-height: 0;
   }
</style>


<main>
   <div class="projects">
           <p class="section-title">View Hotels</p>
           <br />
           <div class="project-card">
             <div>
         <table id="sampleTable" style="width:100%; padding:1rem;">
            <thead style="background-color:#cf711f;">
               <tr style="font-weight: bold; padding:1rem; justify-content: center;">
                   <th style="color:#FFF; font-weight: bold; padding:1rem; justify-content: center;">Hotel Id</th>
                   <th style="color:#FFF; font-weight: bold; padding:1rem; justify-content: center;">Hotel Name</th>
                   <th style="color:#FFF; font-weight: bold; padding:1rem; justify-content: center;">Hotel Type</th>
                 <!--  <th style="color:#FFF; font-weight: bold; padding:1rem; justify-content: center;">Active/Inactive</th> -->
                   <th style="color:#FFF; font-weight: bold; padding:1rem; justify-content: center;">Action</th>
               </tr>
            </thead>
         </table>
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


<script>
	$('table#sampleTable').DataTable({
		ajax: '/apidataTable/getHotels',
		serverSide: true,
		columns: [

			{
				data: 'hotelId'
			},
			{
				data: 'hotelName'
			},
			{
            				data: 'hotelType.htypeName'
            			},

			//{
			//	data: 'active',
			//	render: function (data) {
			//		console.log(data);
			//		if (data == true) {
			//			return '<div>' + data + '</div>'
			//		} else {
			//			return '<div>' + data + '</div>'
			//		}
			//	}
			//},


			{
				data: 'hotelId',
				render: function (data) {
					return '<a class="link" href="${pageContext.request.contextPath}/updateHotel/${"' + data + '"}"  ;>Update</a>'
				}


			}
		],
		pagingType: "simple_numbers", // Optional: For simpler pagination controls
         drawCallback: function() {
             // Replace "Previous" and "Next" text with Material Icons
             $('.dataTables_paginate .previous').html('<span class="material-icons">navigate_before</span>');
             $('.dataTables_paginate .next').html('<span class="material-icons">navigate_next</span>');
         },
          initComplete: function () {
                     // Move search box and length dropdown to the same row
                     const length = $('.dataTables_length');
                     const filter = $('.dataTables_filter');
                     const dtTop = $('<div class="dt-top"></div>');

                     length.appendTo(dtTop);
                     filter.appendTo(dtTop);
                     dtTop.prependTo('.dataTables_wrapper');
                 }
	});

</script>