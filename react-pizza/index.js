import  express, { response }  from 'express';
import { createConnection } from 'mysql';

const app=express();
app.use(express.json());

const conn=createConnection({
    host:"localhost",
    user:"root",
    password:"Akshay@16",
    database:"pizzas"
});

app.post('/pizzalist',(request,response)=>{
    var insertQry=`INSERT INTO pizza_list VALUES(
        ${request.body.large},
        ${request.body.medium},
        '${request.body.pizzacategory}',
        '${request.body.pizzadescription}',
        '${request.body.pizzaimage}',
        '${request.body.pizzaname}',
        '${request.body.subcategory}',
        '${request.body.pizzatype}',
        ${request.body.small})`;

        conn.query(insertQry,(error,result)=>{
            if(error)
            {
                response.status(500).send({message:'Error in Inserting'});
            }
            else
            {
                response.status().send({message:'Inserted'});
            }
        })
});
app.get('/pizzalist',(req,res)=>{

});


app.listen(9800,()=>{
    console.log('listening on port no 9800');
})

conn.connect((error)=>{
    if(error)
    {
        console.log(error);
    }
    else
    {
        console.log("Database connection successfully");
    }
    
});
