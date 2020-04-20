package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminPanel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Panel</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #000000\" onload=\"pelletsLoader()\">\n");
      out.write("        <h2 align=\"center\" style=\"color: #ffff00\"><strong>Admin Panel</strong></h2>\n");
      out.write("        \n");
      out.write("        <div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("            <p style=\"color: #000000\">hey hey</p>\n");
      out.write("            <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("            <a href=\"#\">About</a>\n");
      out.write("            <a href=\"#\">Services</a>\n");
      out.write("            <a href=\"#\">Clients</a>\n");
      out.write("            <a href=\"#\">Contact</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"mother-container\" style=\"background-color: white\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <h4>Configure New Objects</h4>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"radio\" name=\"config-selector\" id=\"departments\" onclick=\"radio_departments()\"/>\n");
      out.write("                        <label for=\"departments\"><span><i></i>New Department</span></label>\n");
      out.write("\n");
      out.write("                        <input type=\"radio\" name=\"config-selector\" id=\"teacher\" onclick=\"radio_teachers()\"/>\n");
      out.write("                        <label for=\"teacher\"><span><i></i>New Teacher</span></label>\n");
      out.write("\n");
      out.write("                        <input type=\"radio\" name=\"config-selector\" id=\"classroom\" onclick=\"radio_classrooms()\"/>\n");
      out.write("                        <label for=\"classroom\"><span><i></i>New Classroom</span></label>\n");
      out.write("\n");
      out.write("                        <input type=\"radio\" name=\"config-selector\" id=\"student\" onclick=\"radio_students()\"/>\n");
      out.write("                        <label for=\"student\"><span><i></i>New Batch</span></label>\n");
      out.write("\n");
      out.write("                        <input type=\"radio\" name=\"config-selector\" id=\"course\" onclick=\"radio_courses()\"/>\n");
      out.write("                        <label for=\"course\"><span><i></i>New Course</span></label>\n");
      out.write("                        \n");
      out.write("                        <input type=\"radio\" name=\"config-selector\" id=\"routines\" onclick=\"radio_routines()\"/>\n");
      out.write("                        <label for=\"routines\"><span><i></i>New Routine</span></label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"creator\" id=\"D\">\n");
      out.write("                        <h4>Department Details</h4>\n");
      out.write("                        <div class=\"input-group input-group-icon\">\n");
      out.write("                            <label for=\"department-name\"><span><i></i>Name</span></label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Department Name/ShortCode\" maxlength=\"4\" id=\"department-name\"/>\n");
      out.write("                            <button id=\"department-creator\" onclick=\"departmentAdmin()\">Create</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"creator\" id=\"T\">\n");
      out.write("                        <h4>Teacher Details</h4>\n");
      out.write("                        <div class=\"input-group input-group-icon\">\n");
      out.write("                            \n");
      out.write("                            <label for=\"teacher-name\"><span><i></i>Name</span></label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Teacher Name/ShortCode\" maxlength=\"4\" id=\"teacher-name\"/>\n");
      out.write("                            \n");
      out.write("                            <label for=\"teacher-full-Name\"><span><i></i>Full Name</span></label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Full Name\" maxlength=\"100\" id=\"teacher-full-Name\"/>\n");
      out.write("                            \n");
      out.write("                            <label for=\"teacher-designation\"><span><i></i>Designation</span></label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Mobile\" maxlength=\"100\" id=\"teacher-designation\"/>\n");
      out.write("                            \n");
      out.write("                            <label for=\"teacher-email\"><span><i></i>Email</span></label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Email\" maxlength=\"100\" id=\"teacher-email\"/>\n");
      out.write("                            \n");
      out.write("                            <label for=\"teacher-mobile\"><span><i></i>Mobile</span></label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Mobile\" maxlength=\"15\" id=\"teacher-mobile\"/>\n");
      out.write("                            \n");
      out.write("                            <button id=\"teacher-creator\" onclick=\"teacherAdmin()\">Create</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"creator\" id=\"C\">\n");
      out.write("                        <h4>Classroom Details</h4>\n");
      out.write("                        <div class=\"input-group input-group-icon\">\n");
      out.write("                            <label for=\"classroom-name\"><span><i></i>Name</span></label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Classroom Name/ShortCode\" maxlength=\"10\" id=\"classroom-name\"/>\n");
      out.write("\n");
      out.write("                            <label for=\"classroom-capacity\"><span><i></i>Capacity</span></label>\n");
      out.write("                            <input type=\"number\" placeholder=\"Classroom Capacity\" max=\"1000\" id=\"classroom-capacity\"/>\n");
      out.write("                            <button id=\"classroom-creator\" onclick=\"classroomAdmin()\">Create</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <div class=\"creator\" id=\"R\">\n");
      out.write("                        <h4>Routine Details</h4>\n");
      out.write("                        <div class=\"input-group input-group-icon\">\n");
      out.write("                            <label for=\"routine-from\"><span><i></i>From</span></label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Jan-2020\" maxlength=\"20\" id=\"routine-from\"/>\n");
      out.write("\n");
      out.write("                            <label for=\"routine-to\"><span><i></i>To</span></label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Jun-2020\" maxlength=\"20\" id=\"routine-to\"/>\n");
      out.write("\n");
      out.write("                            <div class=\"fields\">\n");
      out.write("                                <label for=\"routine-TEACHERS\"><span><i></i>Select Teachers</span></label>\n");
      out.write("                                <table id=\"routine-TEACHERS\">\n");
      out.write("                                    <thead>\n");
      out.write("                                    <th class=\"routine-th\">Teachers</th>\n");
      out.write("                                    <th class=\"routine-th\"><input type=\"checkbox\" id=\"all-teachers\" onclick=\"checkAllTeachers()\"/></th>\n");
      out.write("                                    </thead>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"fields\">\n");
      out.write("                                <label for=\"routine-CLASSROOMS\"><span><i></i>Select Classrooms</span></label>\n");
      out.write("                                <table id=\"routine-CLASSROOMS\">\n");
      out.write("                                    <thead>\n");
      out.write("                                    <th class=\"routine-th\">Classrooms</th>\n");
      out.write("                                    <th class=\"routine-th\"><input type=\"checkbox\" id=\"all-classrooms\" onclick=\"checkAllClassrooms()\"/></th>\n");
      out.write("                                    </thead>                                    \n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"fields\">\n");
      out.write("                                <label for=\"routine-STUDENTS\"><span><i></i>Select Batches</span></label>\n");
      out.write("                                <table id=\"routine-STUDENTS\">\n");
      out.write("                                    <thead>\n");
      out.write("                                    <th class=\"routine-th\">Batches</th>\n");
      out.write("                                    <th class=\"routine-th\">#OfStudents</th>\n");
      out.write("                                    <th class=\"routine-th\"><input type=\"checkbox\" id=\"all-students\" onclick=\"checkAllStudents()()\"/></th>\n");
      out.write("                                    </thead>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                            <div class=\"fields\">\n");
      out.write("                                <label for=\"routine-COURSES\"><span><i></i>Select Courses</span></label>\n");
      out.write("                                <table id=\"routine-COURSES\">\n");
      out.write("                                    <thead>\n");
      out.write("                                    <th class=\"routine-th\">courses</th>\n");
      out.write("                                    <th class=\"routine-th\">Assigned teacher</th>\n");
      out.write("                                    <th class=\"routine-th\"><input type=\"checkbox\" id=\"all-courses\" onclick=\"checkAllCourses()()\"/></th>\n");
      out.write("                                    </thead>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <button id=\"routine-creator\" onclick=\"routineAdmin()\">Create</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"creator\" id=\"S\">\n");
      out.write("\n");
      out.write("                        <h4>Student Details</h4>\n");
      out.write("                        <div class=\"input-group input-group-icon\">\n");
      out.write("\n");
      out.write("                            <div class=\"fields\">\n");
      out.write("                                <label for=\"student-session\"><span><i></i>Session</span></label>\n");
      out.write("                                <input type=\"text\" placeholder=\"Session. e.g 201213\" maxlength=\"10\" id=\"student-session\"/>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                            <div class=\"fields\">\n");
      out.write("                            <label for=\"student-semester\"><span><i></i>Semester</span></label>\n");
      out.write("                            <select id=\"student-semester\">\n");
      out.write("                                <option value=\"select\">Select Semester</option>\n");
      out.write("                                <option value=\"1-1\">1-1</option>\n");
      out.write("                                <option value=\"1-2\">1-2</option>\n");
      out.write("                                <option value=\"2-1\">2-1</option>\n");
      out.write("                                <option value=\"2-2\">2-2</option>\n");
      out.write("                                <option value=\"3-1\">3-1</option>\n");
      out.write("                                <option value=\"3-2\">3-2</option>\n");
      out.write("                                <option value=\"4-1\">4-1</option>\n");
      out.write("                                <option value=\"4-2\">4-2</option>\n");
      out.write("                                <option value=\"M-1\">M-1</option>\n");
      out.write("                                <option value=\"M-2\">M-2</option>\n");
      out.write("                            </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("<!--                            <div class=\"fields\">\n");
      out.write("                                <label for=\"student-count\"><span><i></i>Number of Students</span></label>\n");
      out.write("                                <input type=\"number\" placeholder=\"Number of students\" maxlength=\"10\" id=\"student-count\"/>\n");
      out.write("                            </div>-->\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                            <div class=\"fields\">\n");
      out.write("                                <label for=\"student-section\"><span><i></i>Section(If any)</span></label>\n");
      out.write("                                <select id=\"student-section\">\n");
      out.write("                                    <option value=\"No\">No</option>\n");
      out.write("                                    <option value=\"A\">A</option>\n");
      out.write("                                    <option value=\"B\">B</option>\n");
      out.write("                                    <option value=\"C\">C</option>\n");
      out.write("                                    <option value=\"D\">D</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <button id=\"student-creator\" onclick=\"studentAdmin()\">Create</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>                    \n");
      out.write("\n");
      out.write("                    <div class=\"creator\" id=\"CO\">\n");
      out.write("                        <h4>Course Details</h4>\n");
      out.write("                        <div class=\"input-group input-group-icon\">\n");
      out.write("                            <label for=\"course-name\"><span><i></i>Course Code</span></label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Course Code\" maxlength=\"10\" id=\"course-name\"/>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <label for=\"course-fullname\"><span><i></i>Name</span></label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Course Name\" maxlength=\"100\" id=\"course-fullname\"/>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <div class=\"fields\">\n");
      out.write("                                <label for=\"course-credtits\"><span><i></i>Credits</span></label>\n");
      out.write("                                <select id=\"course-credits\">\n");
      out.write("                                    <option selected=\"true\" value=\"select\">Select Course Credits</option>\n");
      out.write("                                    <option value=\"1\">1</option>\n");
      out.write("                                    <option value=\"1.5\">1.5</option>\n");
      out.write("                                    <option value=\"2\">2</option>\n");
      out.write("                                    <option value=\"2.5\">2.5</option>\n");
      out.write("                                    <option value=\"3\">3</option>\n");
      out.write("                                    <option value=\"3.5\">3.5</option>\n");
      out.write("                                    <option value=\"4\">4</option>\n");
      out.write("                                    <option value=\"4.5\">4.5</option>\n");
      out.write("                                    <option value=\"5\">5</option>\n");
      out.write("                                    <option value=\"5.5\">5.5</option>\n");
      out.write("                                    <option value=\"6\">6</option>\n");
      out.write("                                    <option value=\"6.5\">6.5</option>\n");
      out.write("                                    <option value=\"7\">7</option>\n");
      out.write("                                    <option value=\"7.5\">7.5</option>\n");
      out.write("                                    <option value=\"8\">8</option>\n");
      out.write("                                    <option value=\"8.5\">8.5</option>\n");
      out.write("                                    <option value=\"9\">9</option>\n");
      out.write("                                    <option value=\"9.5\">9.5</option>\n");
      out.write("                                    <option value=\"10\">10</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                            <div class=\"fields\">\n");
      out.write("                                <label for=\"course-hours\"><span><i></i>Hours Per Class</span></label>\n");
      out.write("                                <select id=\"course-hours\">\n");
      out.write("                                    <option selected=\"true\" value=\"select\">Select Hours/class</option>\n");
      out.write("                                    <option value=\"1\">1</option>\n");
      out.write("                                    <option value=\"2\">2</option>\n");
      out.write("                                    <option value=\"3\">3</option>\n");
      out.write("                                    <option value=\"4\">4</option>\n");
      out.write("                                    <option value=\"5\">5</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"fields\">\n");
      out.write("                                <label for=\"course-classes\"><span><i></i>Classes per week</span></label>\n");
      out.write("                                <select id=\"course-classes\">\n");
      out.write("                                    <option selected=\"true\" value=\"select\">Select Class/week</option>\n");
      out.write("                                    <option value=\"1\">1</option>\n");
      out.write("                                    <option value=\"2\">2</option>\n");
      out.write("                                    <option value=\"3\">3</option>\n");
      out.write("                                    <option value=\"4\">4</option>\n");
      out.write("                                    <option value=\"5\">5</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("\n");
      out.write("                            <div class=\"fields\">\n");
      out.write("                                <label for=\"course-type\"><span><i></i>Course Type</span></label>\n");
      out.write("\n");
      out.write("                                <select id=\"course-type\" onchange=\"courseTypeController()\">\n");
      out.write("                                    <option selected=\"true\" value=\"select\">Select Course Type</option>\n");
      out.write("                                    <option value=\"Major\">Major</option>\n");
      out.write("                                    <option value=\"Non-Major\">Non-Major</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"fields\">\n");
      out.write("                                <label for=\"course-modality\"><span><i></i>Course Modality</span></label>\n");
      out.write("\n");
      out.write("                                <select id=\"course-modality\">\n");
      out.write("                                    <option selected=\"true\" value=\"select\">Select Course Modality</option>\n");
      out.write("                                    <option value=\"Theory\">Theory</option>\n");
      out.write("                                    <option value=\"Lab\">Lab</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"fields\" id=\"COT\" hidden=\"true\">\n");
      out.write("                                <label for=\"course-teacher\"><span><i></i>Course Teacher</span></label>\n");
      out.write("\n");
      out.write("                                <select id=\"course-teacher\">\n");
      out.write("                                    <option selected=\"true\" value=\"select\">Select Teacher</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"fields\" id=\"CD\" hidden=\"true\">\n");
      out.write("                                <label for=\"course-department\"><span><i></i>Department to offer the course</span></label>\n");
      out.write("\n");
      out.write("                                <select id=\"course-department\">\n");
      out.write("                                    <option selected=\"true\" value=\"select\">Select  Department</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <button id=\"course-creator\" onclick=\"courseAdmin()\">Create</button>\n");
      out.write("                        </div>    \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"pellet-container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <h4>Existing Objects</h4>\n");
      out.write("                    <div id=\"pellet-container\" >\n");
      out.write("                        <table class=\"pellets\" id=\"TEACHERS\">\n");
      out.write("                            <thead>\n");
      out.write("                            <th>Teachers</th>\n");
      out.write("                            </thead>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                        <table class=\"pellets\" id=\"CLASSROOMS\">\n");
      out.write("                            <thead>\n");
      out.write("                            <th>Classrooms</th>\n");
      out.write("                            </thead>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                        <table class=\"pellets\" id=\"STUDENTS\">\n");
      out.write("                            <thead>\n");
      out.write("                            <th>Batches</th>\n");
      out.write("                            </thead>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                        <table class=\"pellets\" id=\"COURSES\">\n");
      out.write("                            <thead>\n");
      out.write("                            <th>Courses</th>\n");
      out.write("                            </thead>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                        <table class=\"pellets\" id=\"DEPARTMENTS\">\n");
      out.write("                            <thead>\n");
      out.write("                            <th>Departments</th>\n");
      out.write("                            </thead>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css-js/css_Admin.css\">\n");
      out.write("    <script src=\"css-js/jqueryGoogle.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"css-js/admin_javascript.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
