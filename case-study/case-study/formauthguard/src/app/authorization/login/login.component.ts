import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { AuthenticationService } from 'src/app/services/authentication.service';
import { FormBuilder,FormGroup,FormControl,Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  errorMessage : string;
  autherized : boolean;
  name:string;
  pswd:string;
  myFormGroup: FormGroup;

  // recieve authentication service in constructor
  // recieve Router service in constructor
  constructor(public auth : AuthenticationService, public router : Router,formBuilder : FormBuilder) { 
    this.myFormGroup= formBuilder .group({
      "u_name" : new FormControl("",Validators.required),"u_pswd": new FormControl("",Validators.required)
    });
      this.errorMessage = "Invalid Credentials!!!";
      this.autherized = true;
  }

  // method to check Login credentials
  checkLogin(){
    // need a service to authenticate
    this.name=this.myFormGroup.controls['u_name'].value;
    this.pswd=this.myFormGroup.controls['u_pswd'].value;

    if(this.auth.authenticate(this.name, this.pswd)){
        // if user autherized navigate to product component
        this.autherized = true;
        this.router.navigate(['/mymedia']);
    }else{
        this.autherized = false;
    }
  }

  ngOnInit() {
  }

}