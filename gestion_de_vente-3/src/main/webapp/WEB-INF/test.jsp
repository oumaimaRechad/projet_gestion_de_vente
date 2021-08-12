<%@ include file="jsp/common/navigation.jspf"%>
<%@ include file="jsp/common/header.jspf"%>
  
    <div class="breadcrumbs">
            <div class="col-sm-4">
                <div class="page-header float-left">
                    <div class="page-title">
                        <h1>Liste Des Articles</h1>
                    </div>
                </div>
            </div>
            
        </div>
        

   

                <div class="col-lg-6">
                <br/>
                <div class="container">
            <button class="btn btn-danger btn-mini" data-toggle="modal" data-target="#addModal">
               Nouveau Article
            </button>
    </div>
    <br/>
    <div class="modal fade" id="addModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <form  role="form" action="add.action" method="post">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                        
                    </div>
                    <div class="modal-body">
                        
                   <div class="form-group" >
	
	
		 <label for="codeArt">Articles</label>
		<select name="codeArt" class="form-control">
		<option  value="" >
					
					-Selectionnez un article-
				</option>
			<c:forEach items="${articlesStock}" var="art">
				<option  value="${art.codeArt}" >
					
					${art.nomArt}
				</option>
			</c:forEach>
		</select>
		
		
	
</div>
 <div class="form-group">
                            <label for="descArt">Description</label>
                            <input id="descArt" name="descArt" placeholder="description" class="form-control" type="text" value=""/>
                        </div>
                        <div class="form-group">
                            <label for="prixArt">Prix</label>
                            <input id="prixArt" name="prixArt" placeholder="prix" class="form-control" type="number" value=""/>
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
                                  <th scope="col">Code Article</th>
                                  <th scope="col">Nom Article</th>
                                  <th scope="col">Description</th>
                                   <th scope="col">Quantité dans le stock</th>
                                  <th scope="col">Prix</th>
                                 <th scope="col">Action</th>
                                  <th scope="col"></th>
                                  
                                </tr>
                              </thead>
                              <c:forEach items="${articles}" var="article">
                              <tbody>
                                
                                
        <tr>
            
            <td> ${article.codeArt}</td>
            <td>${article.nomArt}</td>
            <td>${article.descArt}</td>
            <td>${article.qteArt}</td>
            <td>${article.prixArt}</td>
            
           
            <td> <div class="container">
           
           
            <button type="button" class="btn btn-success btn-sm mt-2" data-toggle="modal" data-target=" #${article.codeArt}">Modifier</button>
    </div>
    </td>
    
    <td>
       <div id="${article.codeArt}" class="modal fade" role="dialog">
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
                            <label for="codeArt">Article N°</label>
                            <input id="codeArt" name="codeArt" placeholder="Nom Article" class="form-control" type="text" value="${article.codeArt}"/>
                        </div>
                        <div class="form-group">
                            <label for="nomArt">Nom Article</label>
                            <input id="nomArt" name="nomArt" placeholder="Nom Article" class="form-control" type="text" value="${article.nomArt}"/>
                        </div>
                       
                        <div class="form-group">
                            <label for="descArt">Description</label>
                            <input id="descArt" name="descArt" placeholder="description" class="form-control" type="text" value="${article.descArt}"/>
                        </div>
                        <div class="form-group">
                            <label for="prixArt">Prix</label>
                            <input  name="prixArt" placeholder="prix" class="form-control" type="number" value="${article.prixArt}"/>
                        </div>
                       
                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-primary">modifier</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">Fermer</button>
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