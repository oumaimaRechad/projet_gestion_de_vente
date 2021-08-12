<%@ include file="common/navigation.jspf"%>
<%@ include file="common/header.jspf"%>
   <div>
		<a type="button" class="btn btn-primary btn-md" href="/add-todo">Add Todo</a>
	</div>
    <div class="breadcrumbs">
            <div class="col-sm-4">
                <div class="page-header float-left">
                    <div class="page-title">
                        <h1>Dashboard</h1>
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
                <div class="container">
            <button class="btn btn-danger btn-mini" data-toggle="modal" data-target="#editUserModal">
                Add user
            </button>
    </div>
    <div class="modal fade" id="editUserModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <form  role="form" action="artVente/add" method="post">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                        
                    </div>
                    <div class="modal-body">
                        
                        <div class="form-group">
                            <label for="article.nomArt">Nom Article</label>
                            <input id="article.nomArt" name="article.nomArt" placeholder="Nom Article" class="form-control" type="text" value=""/>
                        </div>
                        <div class="form-group">
                            <label for="article.descArt">Description</label>
                            <input id="article.descArt" name="article.descArt" placeholder="description" class="form-control" type="text" value=""/>
                        </div>
                        <div class="form-group">
                            <label for="article.prixArt">Prix</label>
                            <input id="article.prixArt" name="article.prixArt" placeholder="prix" class="form-control" type="text" value=""/>
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
                    <div class="card">
                    
                        <div class="card-header">
                            <strong class="card-title">Table Head</strong>
                        </div>
                        <div class="card-body">
                            <table class="table">
                              <thead class="thead-dark">
                                <tr>
                                  <th scope="col">codeArt</th>
                                  <th scope="col">nomArt</th>
                                  <th scope="col">descArt</th>
                                  <th scope="col">prixArt</th>
                                </tr>
                              </thead>
                              <tbody>
                                
                                  <s:iterator value="articles">
        <tr>
            <td align="center"><s:property value="codeArt"/></td>
            <td><s:property value="nomArt"/></td>
            <td><s:property value="descArt"/></td>
            <td><s:property value="prixArt"/></td>
            
        </tr>
        </s:iterator>
                               
                              </tbody>
                            </table>

                        </div>
                    </div>
                </div>


               

   
<%@ include file="common/footer.jspf"%>