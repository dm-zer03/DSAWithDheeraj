using Microsoft.EntityFrameworkCore;
using WebAPI_1.Models;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.

builder.Services.AddControllers();
// Learn more about configuring OpenAPI at https://aka.ms/aspnet/openapi
builder.Services.AddOpenApi();
//Before app build
builder.Services.AddSwaggerGen();
builder.Services.AddDbContext<WebApidbContext>(x => x.UseSqlServer(builder.Configuration.GetConnectionString("constr")));

var app = builder.Build();

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.MapOpenApi();
}

app.UseHttpsRedirection();

app.UseAuthorization();

app.MapControllers();
//After Map Controller
app.UseSwagger();
app.UseSwaggerUI();

app.Run();
