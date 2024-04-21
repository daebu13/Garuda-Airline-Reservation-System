import React, { Component } from "react";
import { Link } from "react-router-dom";
import axios from "axios";

export default class SignUp extends Component {
    constructor() {
        super();
        this.state={
            email:'',
            password:'',
            firstName:'',
            lastName:'',
            contact_number:'',
            emailError:'',
            passwordError:'',
            firstNameError:'',
            lastNameError:'',
            contact_numberError:'',
            isProfile: false,

        }
        this.register = this.register.bind(this);
        this.handleChange = this.handleChange.bind(this);
      } 
      valid(){
        if(this.state.email.length<4 && this.state.password.length<6 && this.state.firstName.length<1 && this.state.lastName.length<1 && this.state.role.length<1&&this.state.contact_number<10){
         this.setState({emailError:"Invalid Username",
          passwordError: "Password length should be more than 6",
          firstNameError:"First name can't be empty",
          lastNameError:"Last name can't  be empty",
          contact_number:"Mobile number should contain 10 digits"
        })
      }
      else  if(this.state.email.length<4){
          this.setState({
          emailError:"Invalid email"})
          }
      else  if(this.state.password.length<6){
        this.setState({
        passwordError:"Password length should be more than 6"})
        }
      else  if(this.state.firstName.length<1){
        this.setState({
        firstnameError:"Firstname can't be empty"})
        }
      else  if(this.state.lastName.length<1){
        this.setState({
        lastnameError:"lastname can't be empty"})
      }
      else if(this.state.contact_number.length<10){
        this.setState({
          contact_numberError:"Mobile number should contain 10 digits"
        })
      }
      else{
        return true
      }

      
    }
    
    register(e){
      this.setState({emailError:"",
      passwordError: "",
      firstNameError:"",
      lastNameError:"",
      contact_numberError:""
    })
    e.preventDefault();
      if(this.valid()){
        fetch("http://localhost:8682/subs", {
          "method": "POST",
          "headers": {
            "content-type": "application/json",
            "accept": "application/json",
            "Access-Control-Allow-Origin": "*"
            
          },
          "body": JSON.stringify({
            email: this.state.email,
            password: this.state.password,
            firstName: this.state.firstName,
            lastname: this.state.lastName,
            contact_number:this.state.contact_number
          })
        })
        .then(response => response.json())
        .then(response => {
         alert("your registration is successfully submitted")
        })
        .catch(err => {
          alert("your registration is not submitted")
        });
      }
    }
    
    handleChange(changeObject) {
        this.setState(changeObject)
      }
    
   render(){
        return (
            <div className="outer">
               <div className="inner">
            <form>
                <h3>Register</h3>

                
                

                <div className="form-group">
                    <label>FirstName</label>
                    <input type="text" className="form-control" placeholder="Please Enter your first name"  
                    onChange={(e) => this.handleChange({ firstName: e.target.value })}/>
                    <p style={{color:"red" }}>{this.state.firstNameError}</p>
                </div>

                <div className="form-group">
                    <label>LastName</label>
                    <input type="text" className="form-control" placeholder="Please Enter Your last name" 
                    onChange={(e) => this.handleChange({ lastName: e.target.value })} />
                    <p style={{color:"red" }}>{this.state.lastNameError}</p>
                </div>

                <div className="form-group">
                    <label>Email</label>
                    <input type="text" className="form-control" placeholder="Please Enter your email" 
                    onChange={(e) => this.handleChange({ email: e.target.value })} />
                    <p style={{color:"red" }}>{this.state.emailError}</p>
                </div>

                <div className="form-group">
                    <label>Password</label>
                    <input type="password" className="form-control" placeholder="Enter password"  
                    onChange={(e) => this.handleChange({ password: e.target.value })} />
                    <p style={{color:"red" }}>{this.state.passwordError}</p>
                </div>

                <div className="form-group">
                    <label>contact_number</label>
                    <input type="number" className="form-control" placeholder="Please Enter your mobile number"  
                    onChange={(e) => this.handleChange({ contact_number: e.target.value })}/>
                    <p style={{color:"red" }}>{this.state.contact_numberError}</p>
                </div>


                <button type="submit" className="btn btn-dark btn-lg btn-block" onClick={(e)=>this.register(e)}>Register</button>
              <p>Have an account?  <Link to="/login">Login Here</Link></p>
            </form>
            </div>
            </div>
        );
   }
  }