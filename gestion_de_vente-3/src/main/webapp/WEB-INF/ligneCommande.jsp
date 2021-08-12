<%@ include file="jsp/common/navigation.jspf"%>
<%@ include file="jsp/common/header.jspf"%>
   
    <div class="breadcrumbs">
             <div class="col-sm-4">
                <div class="page-header float-left">
                    <div class="page-title">
                        <h1>Liste De Ligne Commande</h1>
                    </div>
                </div>
            </div>
            <div class="col-sm-8">
                <div class="page-header float-right">
                    <div class="page-title">
                        <ol class="breadcrumb text-right">
                            <li><a href="#">Gestion de commandes</a></li>
                            <li><a href="#">Liste de commandes</a></li>
                           
                        </ol>
                    </div>
                </div>
            </div>
        </div>
        

   

                <div class="col-lg-6">
                 <br/>
                <div class="container">
            <a href="formLignCmd.action"><button class="btn btn-danger btn-mini" data-toggle="modal" data-target="#editUserModal">
               Nouveau Ligne De Commande
            </button></a>
            
    </div>
    <br/>
     <br/>
  
   
                   
                    
                       
                           
                        </div>
                       
                            <table class="table">
                              <thead class="thead-dark">
                                <tr>
                                  <th scope="col">numero de ligne </th>
                                  <th scope="col">article </th>
                                  <th scope="col">numero de commande </th>
                                  
                                  <th scope="col">Quantité</th>
                                  
                                
                                 
                                  
                                </tr>
                              </thead>
                              <c:forEach items="${ligneCmds}" var="ligneCmd">
                              <tbody>
                                
                                
        <tr>
              <td>${ligneCmd.codeLigneCmd}</td>
            <td>${ligneCmd.cmd.codeCmd}</td>
              <td>${ligneCmd.art.nomArt}</td>
            <td>${ligneCmd.qteCmd}</td>
          
            
  
           
     
           
   
            
    </tr>
       
                               
                              </tbody>
                              </c:forEach>
                            </table>
                       
                  
               


               

   
<%@ include file="jsp/common/footer.jspf"%>