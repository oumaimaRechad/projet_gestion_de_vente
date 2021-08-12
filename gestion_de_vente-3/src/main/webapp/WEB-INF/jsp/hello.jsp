<%@ taglib prefix="s" uri="/struts-tags" %>


<%@ include file="jsp/common/navigation.jspf"%>
<%@ include file="jsp/common/header.jspf"%>
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


               

   
<%@ include file="jsp/common/footer.jspf"%>