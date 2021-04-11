package com.travelService.helperutil;

import org.springframework.stereotype.Component;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Component
public class AmazonSupportS3 {
    private static S3Client s3;

public void uploadImageFile(byte[] uploadedInputStream) throws IOException {

    String bucketName = "kindandereddydande";
    String key = "kingKing13.jpg";

    Region region = Region.AP_SOUTH_1;
    s3 = S3Client.builder()
            .region(region)
				.build();

    PutObjectRequest objectRequest = PutObjectRequest.builder()
            .bucket(bucketName)
            .key(key)
            .build();

    //s3.putObject(objectRequest, RequestBody.fromByteBuffer(getRandomByteBuffer(10_000)));
    s3.putObject(objectRequest, RequestBody.fromByteBuffer(ByteBuffer.wrap(uploadedInputStream)));
    System.out.println("success");
}
    void UploadVideoFile(){

        String bucketName = "kindandereddydande";
        String key = "kingKing";

        Region region = Region.AP_SOUTH_1;
        s3 = S3Client.builder()
                .region(region)
                .build();
    }

    /**
     * Upload an object in parts
     */
    public static void multipartUpload(InputStream inputStream) throws IOException {
        String bucketName = "kindandereddydande";
        String key = "kingKing113111";

        Region region = Region.AP_SOUTH_1;
        s3 = S3Client.builder()
                .region(region)
                .build();
        int mB = 5 * 1024 * 1024;
        // snippet-start:[s3.java2.s3_object_operations.upload_multi_part]
        // First create a multipart upload and get the upload id
        CreateMultipartUploadRequest createMultipartUploadRequest = CreateMultipartUploadRequest.builder()
                .bucket(bucketName)
                .key(key)
                .build();

        CreateMultipartUploadResponse response = s3.createMultipartUpload(createMultipartUploadRequest);
        String uploadId = response.uploadId();
        System.out.println(uploadId);

        int read = 0;
        int partNumber = 1;
        byte[] bytes = new byte[mB];
        List<CompletedPart> results = new ArrayList<>();
        while ((read = inputStream.read(bytes)) != -1) {

            UploadPartRequest uploadPartRequest = UploadPartRequest.builder()
                    .bucket(bucketName)
                    .key(key)
                    .uploadId(uploadId)
                    .partNumber(partNumber).build();
            String etag1 = s3.uploadPart(uploadPartRequest, RequestBody.fromByteBuffer(ByteBuffer.wrap(bytes, 0, read))).eTag();
            CompletedPart part = CompletedPart.builder().partNumber(partNumber).eTag(etag1).build();
            results.add(part);
            partNumber++;
        }
        CompletedMultipartUpload completedMultipartUpload = CompletedMultipartUpload.builder()
                .parts(results)
                .build();

        CompleteMultipartUploadRequest completeMultipartUploadRequest =
                CompleteMultipartUploadRequest.builder()
                        .bucket(bucketName)
                        .key(key)
                        .uploadId(uploadId)
                        .multipartUpload(completedMultipartUpload)
                        .build();

        s3.completeMultipartUpload(completeMultipartUploadRequest);
        // snippet-end:[s3.java2.s3_object_operations.upload_multi_part]
    }

    private static ByteBuffer getRandomByteBuffer(int size) throws IOException {
        byte[] b = new byte[size];
        new Random().nextBytes(b);
        return ByteBuffer.wrap(b);
    }
}