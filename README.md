<h1>Array Rotation</h1>

<p><strong>Description</strong></p>

<p>This Java exercise rotates the elements in an array.</p>

<h2>Group Members/Contributors</h2>
<ul>
  <li>Hanior Nabem Nathaniel - BHU/22/04/09/0074</li>
  <li>Ezekiel Oyidih - BHU/22/04/05/0026</li>
  <li>Ngakilahyel Samuel - BHU/22/04/10/0019</li>
  <li>Caleb Joshua Fuojima - BHU/22/04/05/0018</li>
  <li>Precious Oguntuase Toluwalope - BHU/22/04/05/0070</li>
</ul>

<p><strong>Method</strong></p>
<p>A left rotation operation on an array shifts each of the array elements 1 unit to the left. More details in <code>question.txt</code> </p>

<p><strong>Algorithm</strong></p>

<ol>
  <li>Define the function <code>rotLeft</code> and pass int 'a' and int 'd' as parameters with an integer array as a return type.</li>
  <li>Initialize a variable 'n_elements' to store the length of array 'a'.</li>
  <li>Create a new integer array 'rot' with the same length as array 'a'.</li>
  <li>Loop through the original array 'a';
    <ul>
      <li>Calculate the index for the rotated array ('rot') using the formula '(i + (n_elements - d)) % n_elements'.</li>
      <li>Assign the value of 'a[i]' to the calculated index in the rotated array.</li>
    </ul>
  </li>
  <li>End the loop.</li>
  <li>Return the rotated array 'rot'.</li>
</ol>
</html>
