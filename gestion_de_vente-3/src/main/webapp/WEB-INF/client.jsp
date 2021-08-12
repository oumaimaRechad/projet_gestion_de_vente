<%@ include file="jsp/common/navigation.jspf"%>
<%@ include file="jsp/common/header.jspf"%>
  
    <div class="breadcrumbs">
            <div class="col-sm-4">
                <div >
                    <div >
                        <h1>Liste Des Clients</h1>
                    </div>
                </div>
            </div>
            <div class="col-sm-8">
                <div class="page-header float-right">
                    <div class="page-title">
                        <ol class="breadcrumb text-right">
                            <li><a href="#">Dashboard</a></li>
                            <li><a href="#">Table</a></li>
                            <li class="active">Basic table</li>
                        </ol>
                    </div>
                </div>
            </div>
        </div>
        

   

                <div class="col-lg-6">
                 <br/>
                <div class="container">
            <button class="btn btn-danger btn-mini" data-toggle="modal" data-target="#editUserModal">
               Nouveau Client
            </button>
           
    </div>
     <br/>
    <div class="modal fade" id="editUserModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <form  role="form" action="addClient.action" method="post">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                        
                    </div>
                    <div class="modal-body">
                        
                   <div class="form-group" >
	
	
		 <label for="nomClt">Client</label>
		
 <input id="nomClt" name="nomClt" placeholder="Nom de client" class="form-control" type="text" value=""/>
                        </div>
 <div class="form-group">
                            <label for="adreessClt">Adresse</label>
                            <input id="adreessClt" name="adreessClt" placeholder="description" class="form-control" type="text" value=""/>
                        </div>
                        <div class="form-group">
                            <label for="contact">Contact</label>
                            <input id="contact" name="contact" placeholder="contact" class="form-control" type="text" value=""/>
                        </div>
                       
                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-primary">enregistrer</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div><!-- /.modal-content -->
            </form>
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
    </div>
                   
                            <table class="table">
                              <thead class="thead-dark">
                                <tr>
                                  <th scope="col">Id</th>
                                  <th scope="col">société</th>
                                  <th scope="col">adresse</th>
                                   <th scope="col">Contact</th>
                                    <th scope="col">Actions</th>
                                  
                                 
                                  <th scope="col"></th>
                                  
                                </tr>
                              </thead>
                              <c:forEach items="${clients}" var="client">
                              <tbody>
                                
                                
        <tr>
            
            <td> ${client.idClt}</td>
            <td>${client.nomClt}</td>
            <td>${client.adreessClt}</td>
            <td>${client.contact}</td>
          
           
            <td> <div class="container">
           
           
            <button type="button" class="btn btn-success btn-sm mt-2" data-toggle="modal" data-target=" #${client.idClt}">Modifier</button>
    </div>
    </td>
    
    <td>
       <div id="${client.idClt}" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
     <form  role="form" action="update.action" method="post">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                        
                    </div>
                    <div class="modal-body">
                         <div class="form-group">
                            <label for="idClt">societé N°</label>
                            <input id="codeArt" name="codeArt" placeholder="Nom Article" class="form-control" type="text" value="${client.idClt}"/>
                        </div>
                        <div class="form-group">
                            <label for="nomClt">Nom</label>
                            <input id="nomClt" name="nomClt" placeholder="Nom Article" class="form-control" type="text" value="${client.nomClt}"/>
                        </div>
                       
                        <div class="form-group">
                            <label for="adreessClt">Adresse</label>
                            <input id="adreessClt" name="adreessClt" placeholder="adresse" class="form-control" type="text" value="${client.adreessClt}"/>
                        </div>
                        <div class="form-group">
                            <label for="contact">Contact</label>
                            <input  name="contact" placeholder="contact" class="form-control" type="text" value="${client.contact}"/>
                        </div>
                       
                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-primary">modifier</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                   
                </div><!-- /.modal-content -->
            </form>
        
    </div>

  </div>
</div></td>
            
    </tr>
       
                               
                              </tbody>
                              </c:forEach>
                            </table>

                       
               


               

   
                       
                  
               


               

   
<%@ include file="jsp/common/footer.jspf"%>