**Introduction and purpose**

  --Definitions, system overview and references--

  -> Web application name, logo and motto:

  -> Main purpose: Keep track of the value and the quality of several stores, based on the input from the users

**Overall description**

  --System interfaces, user interfaces, software interfaces, communication interfaces--

  -> Software description: register and examine the value of several products found on nearby stores through our web service. The application is based on the method of crowdsourcing, where a group of people combine information to achieve a common goal, usually via the internet. In our case, the common goal is to keep track of the quality and the value of different products and optimize the customers choice.

**Product functions**

**User characteristics**

  -> Types of users
    a. Registered user: update information via the user interface and the RESTful API
    b. Administrator: (Password required) manage the accounts, i.e. he can delete or block a user
    c. Visitor: query our database with several criteria, such as location, time stamp and type of products

  -> Users actions
    a.
      i. Create an account
      ii. Connect using a username and an Password
      iii. Visit his profile page where he can manage his profile and he can delete his account
      iv. Register products, with a time stamp, a location, a value and possibly some general comments
      v. Communicate with the administrator and send feedback
      vi. Perform visitor's actions
    b.
      i. Verify administrator privileges through the use of a private key
      ii. Access users information and track their history
      iii. Delete, modify or restore user accounts after their request
      iv. Perform visitor's actions

      --Object oriented approach--

        Each entity is defined by a set of attributes and methods


**Constraints, assumptions and dependencies**
  --Questions--
  a. How do we make profit from the application?
    Keep a percentage (5-10%) from the sales
    Use advertises, possibly with a dynamic approach based on the user preferences
  b.  

**Specific requirements**

  --External interface requirements, Functional requirements, Software system attributes--
    -> Reliability
    -> Availability: The application has to be constantly available.
    -> Security: Use the secure version of http, which is https and it means that all communications between the website and the browser are encrypted. In that way, customers information like credit card numbers cannot be intercepted and potential customers are more likely to trust use. To achieve that, security certificate (SSL) that can be verified by the certificate authorities must be installed.
    -> Maintainability: After the completion of the project, a regular functional control of the application to detect any abnormalities.
    -> Portability: Mobile/tablet app or web service?
